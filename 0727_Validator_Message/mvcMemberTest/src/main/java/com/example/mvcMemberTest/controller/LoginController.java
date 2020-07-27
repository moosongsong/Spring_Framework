package com.example.mvcMemberTest.controller;

import com.example.mvcMemberTest.exception.MemberException;
import com.example.mvcMemberTest.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    private LoginService service;

    @RequestMapping(value = "/myPage")
    public String myPage(){
        return "myPage";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "logForm";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("email") String email,
                        @RequestParam("pass") String pass,
                        HttpSession session){

        try{
            service.execute(session, email, pass);
            return "myPage";
        }catch (MemberException e){
            e.printStackTrace();
            return "loginError";
        }
    }
}
