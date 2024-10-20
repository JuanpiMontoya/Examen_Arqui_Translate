package com.example.Translate_Service.model;

public class ErrorResponse {
    private String message;

    public ErrorResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "{\"message\": \"" + message + "\"}";
    }
}