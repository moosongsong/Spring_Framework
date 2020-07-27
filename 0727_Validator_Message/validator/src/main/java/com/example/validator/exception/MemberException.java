package com.example.validator.exception;

public abstract class MemberException extends RuntimeException{
    public MemberException(String message){
        super(message);
    }
}
