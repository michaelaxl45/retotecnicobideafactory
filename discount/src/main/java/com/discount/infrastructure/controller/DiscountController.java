package com.discount.infrastructure.controller;

import com.discount.application.UserDiscountService;
import com.discount.domain.dto.request.UserDiscountRequest;
import com.discount.domain.dto.response.UserDiscountResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("discount/v1")
public class DiscountController {

    @Autowired
    private UserDiscountService discountService;

    @PostMapping(value="new")
    public ResponseEntity<UserDiscountResponse> get(@RequestBody UserDiscountRequest userDiscountRequest)
    {
        UserDiscountResponse userDiscountResponse = discountService.create(userDiscountRequest);
        return ResponseEntity.ok(userDiscountResponse);
    }
}
