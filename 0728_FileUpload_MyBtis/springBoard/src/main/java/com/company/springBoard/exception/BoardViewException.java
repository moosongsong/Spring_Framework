package com.company.springBoard.exception;

public class BoardViewException extends BoardException{
    public static final String MESSAGE="BOARD VIEW EXCEPTION";
    public BoardViewException(String message) {
        super(message);
    }
    public BoardViewException(){
        this(MESSAGE);
    }
}
