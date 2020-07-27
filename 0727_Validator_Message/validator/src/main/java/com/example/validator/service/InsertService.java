package com.example.validator.service;


import com.example.validator.command.MemberCommand;
import com.example.validator.exception.MemberException;

public interface InsertService {
    void execute(MemberCommand member) throws MemberException;
}
