package com.company.springBoard.exception;

public class BoardInsertException extends BoardException{
    public static final String MESSAGE="BOARD INSERT EXCEPTION";
    public BoardInsertException(String message) {
        super(message);
    }
    public BoardInsertException(){
        this(MESSAGE);
    }
}
