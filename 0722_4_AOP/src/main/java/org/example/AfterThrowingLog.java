package org.example;

import org.springframework.aop.ThrowsAdvice;

public class AfterThrowingLog implements ThrowsAdvice {
    public void afterThrowing(NullPointerException e) throws Throwable{
        System.out.println("null 참조가 발생함.");
    }
    public void afterThrowing(NumberFormatException e) throws Throwable{
        System.out.println("형식 변환 오류가 발생함.");
    }
}
