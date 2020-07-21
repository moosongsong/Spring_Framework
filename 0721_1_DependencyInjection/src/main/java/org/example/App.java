package org.example;

import org.example.vo.Member;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
//        ClassPathXmlApplicationContext context
//                = new ClassPathXmlApplicationContext("org/example/config/AppConfig.xml");
        FileSystemXmlApplicationContext context
                = new FileSystemXmlApplicationContext("src/main/java/org/example/config/AppConfig.xml");
        // 모두 applicationConfig 를 상속 받았다.

        Member member1 = (Member) context.getBean("member1", Member.class);
        Member member2 = (Member) context.getBean("member2", Member.class);
        System.out.println(member1);
        System.out.println(member2);

        // 싱글톤 처럼 작동한다.
        System.out.println(member2 == member1);
    }
}
