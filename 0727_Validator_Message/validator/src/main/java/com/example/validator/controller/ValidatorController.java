package com.example.validator.controller;


import com.example.validator.command.MemberCommand;
import com.example.validator.val.MemberValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ValidatorController {
//    1.
//    @RequestMapping(value = "/validator")
//    public String validator(@ModelAttribute("info") MemberCommand memberCommand, Model model){
//        model.addAttribute("info", new MemberCommand());
//        return "form";
//    }

//    2.
//    @RequestMapping(value = "/validator", method = RequestMethod.GET)
//    public String getValidator(@ModelAttribute("info") MemberCommand memberCommand){
//        model.addAttribute("info", new MemberCommand());
//        return "form";
//    }
//    @RequestMapping(value = "/validator", method = RequestMethod.POST)
//    public String postValidator(@ModelAttribute("info") MemberCommand memberCommand){
//        return "form";
//    }

//    3.
    @RequestMapping(value = "/validator", method = RequestMethod.GET)
    public String validator(Model model){
        model.addAttribute("info", new MemberCommand());
        return "form";
    }
    @RequestMapping(value = "/validator", method = RequestMethod.POST)
    public String validator(@ModelAttribute("info") MemberCommand memberCommand, Errors errors){
        new MemberValidator().validate(memberCommand, errors);
        if (errors.hasErrors()){
            return "form";
        }
        return "result";
    }
}
