//package com.company.springBoard.controller;
//
//import com.company.springBoard.command.BoardCommand;
//import com.company.springBoard.exception.BoardException;
////import com.company.springBoard.service.BoardInsertService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//@Controller
//public class InsertController {
//    @Autowired
//    BoardInsertService service;
//
//    @RequestMapping(value = "/insert", method = RequestMethod.GET)
//    public String insert(){
//        return "insert";
//    }
//
//    @RequestMapping(value = "/insert", method = RequestMethod.POST)
//    public String insert(@ModelAttribute("command")BoardCommand boardCommand, Model model){
//        if (boardCommand.getEmail().trim().equals("")){
//            model.addAttribute("errorMessage", "이메일 입력");
//            return "insert";
//        }
//        if (boardCommand.getTitle().trim().equals("")){
//            model.addAttribute("errorMessage", "제목 입력");
//            return "insert";
//        }
//        if (boardCommand.getContent().trim().equals("")){
//            model.addAttribute("errorMessage", "내용 입력");
//            return "insert";
//        }
//        try {
//            service.execute(boardCommand);
//        } catch (BoardException e) {
//            return "error";
//        }
//        return "result";
//    }
//
//    @RequestMapping(value = "/error" )
//    public String error(){
//        return "error";
//    }
//
////    @ExceptionHandler(BoardException.class)
////    public String error(){
////        return "error";
////    }
//}
