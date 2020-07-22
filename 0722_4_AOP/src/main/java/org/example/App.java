package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        Test test = (Test) context.getBean("proxy");
        test.print();

        int tot = test.tot();
        double avg = test.avg();
    }
}
