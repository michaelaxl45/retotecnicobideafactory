package com.booking.infrastructure.controller;

import com.booking.infrastructure.config.ConvertTo;
import com.booking.domain.entities.Book;
import com.booking.domain.dto.request.BookRequest;
import com.booking.domain.dto.response.BookResponse;
import com.booking.application.BookService;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping(value = "book")
@OpenAPIDefinition(info = @Info(title = "Book", version = "1.0.0", description = "SpringBoot Server Dev"))
public class BookController {

    @Autowired
    private BookService bookService;
    @Autowired
    private ConvertTo convertTo;


    @PostMapping
    @RateLimiter(name="default")
    @Retry(name = "sample-api")
    @ApiOperation(value="create a new Booking",
            notes = "will create a new Booking, you must add valid properties",
            response = BookResponse.class, code = 200
    )
    public ResponseEntity<BookResponse> create(@RequestBody @Valid BookRequest bookRequest)  {
        Book book =  convertTo.Book(bookRequest);
        BookResponse result = bookService.create(book);
        return ResponseEntity.ok(result);
    }
}
