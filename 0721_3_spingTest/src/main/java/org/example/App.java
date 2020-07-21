package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;

public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AppContext.xml");
        List<String> list = (List<String>) context.getBean("list2");
        for (String name :list) {
            System.out.println(name);
        }

        HashMap map = context.getBean(HashMap.class);
        map.put("1", "one");
        map.put("2", "two");

        System.out.println(map.get("1"));
        System.out.println(map.get("2"));
    }
}
