package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
//        ((AbstractApplicationContext)context).registerShutdownHook();

        Manager manager = context.getBean(Manager.class);
        manager.pay();

        context.close();
    }
}
