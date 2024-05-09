package com.codex.hackfest.exception;

public class TokenValidationException extends RuntimeException{
    public static final Long serialVersionUID = 1L;

    public TokenValidationException(String message){
        super(message);
    }
}
