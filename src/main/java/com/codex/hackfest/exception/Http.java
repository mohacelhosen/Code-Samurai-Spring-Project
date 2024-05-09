package com.codex.hackfest.exception;

import org.springframework.http.HttpStatus;

public class Http {
    public static ErrorResponse errorResponse(HttpStatus status, String message) {
        return new ErrorResponse(status.getReasonPhrase(), message, status.value());
    }
}
