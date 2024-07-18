package com.booking.infrastructure.config;

public class InvalidDiscountException extends RuntimeException {

    private String message;

    public InvalidDiscountException(String errorMessage) {
            super(errorMessage);
        }
}

