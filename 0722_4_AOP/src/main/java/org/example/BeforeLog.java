package org.example;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeLog implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("호출 메서드 : " +method.getName());
        System.out.println("호출대상 : "+o.getClass().getName());
        System.out.println("호출 시 인수의 수 : "+objects.length);
        for (Object obj:objects) {
            System.out.print(obj+" ");
        }
    }
}
