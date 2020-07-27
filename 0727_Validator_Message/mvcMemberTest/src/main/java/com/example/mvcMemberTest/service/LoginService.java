package com.example.mvcMemberTest.service;

import com.example.mvcMemberTest.exception.MemberException;

import javax.servlet.http.HttpSession;

public interface LoginService {
    void execute(HttpSession session, String email, String pass) throws MemberException;
}
