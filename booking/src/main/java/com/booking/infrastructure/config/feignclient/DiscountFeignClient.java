package com.booking.infrastructure.config.feignclient;

import com.booking.domain.dto.request.UserDiscountRequest;
import com.booking.domain.dto.response.UserDiscountResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient(name = "discountClient", url = "https://sbv2bumkomidlxwffpgbh4k6jm0ydskh.lambda-url.us-east-1.on.aws")
public interface DiscountFeignClient {
    @PostMapping
    ResponseEntity<UserDiscountResponse> hasDiscount(@RequestBody UserDiscountRequest userDiscountRequest);
}
