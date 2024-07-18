package com.booking.domain.dto.response;

public class BookResponse {
    private Number code;
    private  String message;

    public BookResponse() {
    }

    public BookResponse(Number code, String message) {
        this.code = code;
        this.message = message;
    }


    public Number getCode() {
        return code;
    }

    public void setCode(Number code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
