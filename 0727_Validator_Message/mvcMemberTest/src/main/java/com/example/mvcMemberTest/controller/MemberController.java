package com.example.mvcMemberTest.controller;

import com.example.mvcMemberTest.command.MemberCommand;
import com.example.mvcMemberTest.exception.MemberException;
import com.example.mvcMemberTest.service.MemberInsertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/member")
public class MemberController {
    @Autowired
    @Qualifier("memberInsertService")
    MemberInsertService service;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(){
        return "member/registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@ModelAttribute("info") MemberCommand memberCommand, Model model){
        if(memberCommand.getEmail().trim().equals("")){
            model.addAttribute("errorMessage", "매일 주소를 입력하시오");
            return "member/registerForm";
        }
        if (memberCommand.getPass().trim().equals("")){
            model.addAttribute("errorMessage", "비밀번호를 입력하시오");
            return "member/registerForm";
        }
//        if (!memberCommand.getPass().equals(memberCommand.getPassConfig())){
//            model.addAttribute("errorMessage", "비밀번호 서로 틀림");
//            return "member/registerForm";
//        }
        if (memberCommand.getNick().trim().equals("")){
            model.addAttribute("errorMessage", "회원 이름 입력하시오.");
            return "member/registerForm";
        }
        service.execute(memberCommand);
        return "member/result";
    }

    @ExceptionHandler(MemberException.class)
    public String error(){
        return "member/error";
    }
}
