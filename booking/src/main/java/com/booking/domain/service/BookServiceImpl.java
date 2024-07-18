package com.booking.domain.service;

import com.booking.infrastructure.config.InvalidDiscountException;
import com.booking.infrastructure.config.feignclient.DiscountFeignClient;
import com.booking.domain.entities.Book;
import com.booking.domain.dto.request.UserDiscountRequest;
import com.booking.domain.dto.response.BookResponse;
import com.booking.domain.dto.response.UserDiscountResponse;
import com.booking.infrastructure.repository.BookRepository;
import com.booking.application.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private DiscountFeignClient discountFeignClient;

    @Override
    public BookResponse create(Book bookRequest)  {

        UserDiscountRequest userDiscountRequest = new UserDiscountRequest(bookRequest.getId(), bookRequest.getHouseId(),bookRequest.getDiscountCode());
        UserDiscountResponse userDiscountResponse = discountFeignClient.hasDiscount(userDiscountRequest).getBody();

        if(!userDiscountResponse.getStatus())
        {
            throw new InvalidDiscountException("Invalid Discount");
        }
        bookRepository.save(bookRequest);
        return new BookResponse(200,"Book Accept");

    }
}
