//package org.eample.mvcTest;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
////import javax.servlet.http.HttpServletResponse;
////import java.io.IOException;
////import java.io.PrintWriter;
//
//@Controller
//@RequestMapping("/member")
//public class WelcomeController {
//
//    @RequestMapping(value = "/welcome", method = RequestMethod.POST)
//    public ModelAndView welcome(HttpServletRequest request, Model model){
////        1.
////        String email = request.getParameter("email");
////        model.addAttribute("email",email);
//
////        2.
////        Member member = new Member();
////        member.setName("김석진");
////        member.setNick("찐");
////        model.addAttribute("member", member);
////        return "welcome";
//
////        3.
//        Member member = new Member();
//        member.setName("김석진");
//        member.setNick("찐");
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject(member);
//        modelAndView.setViewName("welcome");
//        return modelAndView;
//    }
//
//}
