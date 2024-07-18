package com.booking.domain.dto.response;

import java.util.ArrayList;
import java.util.List;

public class ErrorResponse {
    private int statusCode;
    private String error;
    private List<String> message = new ArrayList<String>();

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }
}
