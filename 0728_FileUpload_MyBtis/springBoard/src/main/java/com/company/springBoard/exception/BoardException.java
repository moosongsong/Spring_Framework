package com.company.springBoard.exception;

public abstract class BoardException extends Exception{
    public BoardException(String message){
        super(message);
    }
}
