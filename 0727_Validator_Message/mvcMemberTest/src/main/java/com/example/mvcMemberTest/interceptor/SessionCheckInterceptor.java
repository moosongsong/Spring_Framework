package com.example.mvcMemberTest.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionCheckInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handle){
        HttpSession session = request.getSession(false);
        if (session == null){
            return false;
        }

        if (session.getAttribute("loginInfo") == null){
            return false;
        }
        return true;
    }
}
