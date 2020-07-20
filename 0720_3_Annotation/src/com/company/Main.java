package com.company;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        Member member = new Member("sim", 40);
        Class<?> cls = member.getClass();

        Method[] methods = cls.getDeclaredMethods();
        for (Method method:methods) {
            DefaultMethod annotation = method.getAnnotation(DefaultMethod.class);
            if (annotation != null){
                try {
                    method.invoke(member);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
