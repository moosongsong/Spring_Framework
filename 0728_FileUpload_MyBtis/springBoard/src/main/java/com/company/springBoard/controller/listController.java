//package com.company.springBoard.controller;
//
//import com.company.springBoard.exception.BoardException;
//import com.company.springBoard.service.ListServcie;
//import com.company.springBoard.vo.Board;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.util.List;
//import java.util.Locale;
//
//@Controller
//public class listController {
//    @Autowired
//    ListServcie servcie;
//
//    @RequestMapping(value = "/")
//    public String list(Locale locale, Model model){
//        try {
//            List<Board> list = servcie.execute();
//            model.addAttribute("boards",list);
//        } catch (BoardException e) {
//            return "error";
//        }
//        return "list";
//    }
//}
