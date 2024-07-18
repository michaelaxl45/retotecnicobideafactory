package com.discount.application;

import com.discount.domain.dto.request.UserDiscountRequest;
import com.discount.domain.dto.response.UserDiscountResponse;

public interface UserDiscountService {

    UserDiscountResponse create(UserDiscountRequest userDiscountRequest);
}
