package com.example.mvcMemberTest.service;

import com.example.mvcMemberTest.command.MemberCommand;
import com.example.mvcMemberTest.exception.MemberException;

public interface InsertService {
    void execute(MemberCommand member) throws MemberException;
}
