package org.example;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

@Component("arroundLog")
public class AroundLog implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object object = null;
        System.out.println("주업무 이전에 수행할 작업");
        object = methodInvocation.proceed();
        System.out.println("주업무 이후에 수행할 작업");
        return object;
    }
}
