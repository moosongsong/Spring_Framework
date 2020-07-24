package org.eample.mvcTest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MemberController {
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(){
        return "member/registerForm";
    }

//    @RequestMapping(value = "/register", method = RequestMethod.POST)
//    public String register(@RequestParam("email") String email,
//                           @RequestParam("pass") String pass,
//                           @RequestParam("passConfirm") String passConfirm,
//                           @RequestParam("nick") String nick,
//                           Model model){
//        Member member = new Member(email, pass, passConfirm, nick);
//        model.addAttribute(member);
//        return "member/result";
//    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@ModelAttribute("user") Member member, Model model){
//        Member member = new Member(email, pass, passConfirm, nick);
//        model.addAttribute("user", member);
        return "member/result";
    }
}

