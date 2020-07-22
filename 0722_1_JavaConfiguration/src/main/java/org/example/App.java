package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class, SystemConfig.class);
        context.refresh();

        String str =context.getBean(String.class);
        String string = (String) context.getBean("name");

        System.out.println(str);
        System.out.println(string);

        List<String> list = (List<String>) context.getBean("list");
        for (String str1: list) {
            System.out.println(str1);
        }

        Map<String, Integer> map = (Map<String, Integer>) context.getBean("map");
        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key+", "+map.get(key));
        }

        context.close();
    }
}
