package com.discount.domain.services;


import com.discount.domain.dto.request.UserDiscountRequest;
import com.discount.infrastructure.repositories.UserDiscountRepository;
import com.discount.application.DiscountService;
import com.discount.application.UserDiscountService;
import com.discount.domain.entities.Discount;
import com.discount.domain.entities.UserDiscount;
import com.discount.domain.dto.response.UserDiscountResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserDiscountServiceImpl implements UserDiscountService {

    @Autowired
    private UserDiscountRepository userDiscountRepository;

    @Autowired
    private DiscountService discountService;

    @Autowired
    private ModelMapper mapper;

    @Override
    public UserDiscountResponse create(UserDiscountRequest userDiscountRequest) {
       Discount discount = discountService.get(userDiscountRequest.getDiscountCode());

       UserDiscount userDiscount =  mapper.map(userDiscountRequest,UserDiscount.class);
       userDiscount.setDiscountCode(discount);
       UserDiscount userDiscountResult = userDiscountRepository.save(userDiscount);
       UserDiscountResponse userDiscountResponse = mapper.map(userDiscountResult, UserDiscountResponse.class);
       return userDiscountResponse;
    }
}
