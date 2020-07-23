package com.example.exception;

public class PartInsertException extends PartException{
    public static final String MSG = "분류 정보 입력에 실패하였습니다.";

    public PartInsertException(String msg) {
        super(msg);
    }

    public PartInsertException(){
        super(MSG);
    }
}
