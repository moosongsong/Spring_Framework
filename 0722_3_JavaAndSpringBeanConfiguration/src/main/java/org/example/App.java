package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class App
{
//    public static void main( String[] args )
//    {
//        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
//        Map map = context.getBean(HashMap.class);
//        Set keySet = map.keySet();
//        Iterator<String> iterator = keySet.iterator();
//        while (iterator.hasNext()){
//            String key = iterator.next();
//            System.out.println(key+", "+map.get(key));
//        }
//
//        ArrayList<String> list = context.getBean(ArrayList.class);
//        for (String str :
//                list) {
//            System.out.println(str);
//        }
//    }

//    public static void main( String[] args )
//    {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
//        ArrayList<String> list = context.getBean(ArrayList.class);
//        for (String str :
//                list) {
//            System.out.println(str);
//        }
//
//        Map map = context.getBean(HashMap.class);
//        Set keySet = map.keySet();
//        Iterator<String> iterator = keySet.iterator();
//        while (iterator.hasNext()){
//            String key = iterator.next();
//            System.out.println(key+", "+map.get(key));
//        }
//    }

    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        ArrayList<String> list = context.getBean(ArrayList.class);
        for (String name :
                list) {
            System.out.println(name);
        }

        Map<String, Integer> map = (Map<String, Integer>) context.getBean("map");
        Set<String> ketSet = map.keySet();
        Iterator<String> iterator = ketSet.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key+", "+map.get(key));
        }

        User user = context.getBean(User.class);
        user.print();
        user.scorePrint();
    }
}
