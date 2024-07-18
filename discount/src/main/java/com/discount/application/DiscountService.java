package com.discount.application;

import com.discount.domain.entities.Discount;

public interface DiscountService {
    Discount get(String discountCode);
}
