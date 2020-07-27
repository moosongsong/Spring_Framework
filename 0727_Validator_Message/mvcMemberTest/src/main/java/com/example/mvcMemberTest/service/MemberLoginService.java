package com.example.mvcMemberTest.service;

import com.example.mvcMemberTest.dao.MemberDao;
import com.example.mvcMemberTest.exception.MemberException;
import com.example.mvcMemberTest.exception.MemberNotFoundException;
import com.example.mvcMemberTest.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service("login")
public class MemberLoginService implements LoginService{
    @Autowired
    MemberDao dao;

    @Override
    public void execute(HttpSession session,String email, String pass) throws MemberException {
        MemberVO member = dao.login(email, pass);
        if (member == null){
            throw new MemberNotFoundException();
        }
        session.setAttribute("loginInfo", member);
    }
}
