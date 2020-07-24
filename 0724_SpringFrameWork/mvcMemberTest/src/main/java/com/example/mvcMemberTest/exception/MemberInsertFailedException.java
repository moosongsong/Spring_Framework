package com.example.mvcMemberTest.exception;

public class MemberInsertFailedException extends MemberException {
    public static final String MESSAGE = "회원등록에 실패하였습니다.";

    public MemberInsertFailedException(){
        this(MESSAGE);
    }

    public MemberInsertFailedException(String message) {
        super(message);
    }
}
