package org.example;

import org.example.annotationProject.LectureTest;
import org.example.annotationProject.ScoreBoard;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("AppContext.xml");
//        LectureTest test = context.getBean(LectureTest.class);
//        System.out.println(test.getEng());

        ScoreBoard scoreBoard = context.getBean(ScoreBoard.class);
        scoreBoard.print();
    }
}
