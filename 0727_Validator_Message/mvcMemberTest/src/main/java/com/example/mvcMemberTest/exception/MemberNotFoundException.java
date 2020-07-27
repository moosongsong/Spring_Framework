package com.example.mvcMemberTest.exception;

public class MemberNotFoundException extends MemberException{
    public static final String MESSAGE="MEMBER IS NOT FOUND";
    public MemberNotFoundException(String message) {
        super(message);
    }
    public MemberNotFoundException(){
        this(MESSAGE);
    }
}
