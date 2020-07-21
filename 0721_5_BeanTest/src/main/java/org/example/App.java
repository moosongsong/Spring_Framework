package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;
import java.util.Set;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("AppContext.xml");
        Person person = context.getBean("person", Person.class);
        Person person1 = context.getBean("person", Person.class);
        System.out.println(person);
        System.out.println(person1);

        Set set = (Set) context.getBean("set");
        for (Object object : set) {
            System.out.println(object);
        }

        Properties properties = context.getBean("env", Properties.class);
        System.out.println(properties.get("number"));
        System.out.println(properties.get("pi"));
        System.out.println(properties.get("name"));

        ((AbstractApplicationContext) context).registerShutdownHook();


        Person p1 = context.getBean("person1", Person.class);
        Person p2 = context.getBean("person2", Person.class);
    }
}
