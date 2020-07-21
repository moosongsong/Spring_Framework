package com.company;

import com.company.entity.LectureTest;
import com.company.entity.Test;
import com.company.iu.DefaultPrinter;
import com.company.iu.GridPrinter;
import com.company.iu.Printer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AppConfig.xml");
//        LectureTest test = context.getBean(LectureTest.class);
//        Test test = context.getBean(Test.class);
        LectureTest test = (LectureTest) context.getBean(Test.class);// 굳이 이렇게 쓸일은 없음
        // 상위형을 이용해서 객체를 만들 수 있다.
        System.out.println(test + ", "+ test.tot()+", "+test.avg());

        Printer printer1 = context.getBean("printer1", DefaultPrinter.class);
        printer1.print();
        Printer printer2 = context.getBean("printer2", GridPrinter.class);
        printer2.print();
    }
}
