package com.example.springautomappingobjects.exceptions;

public class ValidationException extends RuntimeException{
    public ValidationException(String reason) {
        super(reason);
    }
}
