package com.example.mvcMemberTest.exception;

public abstract class MemberException extends RuntimeException{
    public MemberException(String message){
        super(message);
    }
}
