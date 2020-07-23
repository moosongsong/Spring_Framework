package main.java;

import main.java.service.MemberInsertService;
import main.java.service.MemberSelectByEmailAndPassService;
import main.java.service.MemberSelectedByEmailService;
import main.java.vo.Member;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.Random;

public class App {
    public static void main(String [] args) throws Exception {
        ApplicationContext context = new GenericXmlApplicationContext("main/resources/SpringConfig.xml");
        DataSource dataSource = context.getBean(DataSource.class);
        JdbcTemplate template = context.getBean(JdbcTemplate.class);
        System.out.println(dataSource);
        System.out.println(template);

        Random random = new Random();
        int i = random.nextInt();
        MemberInsertService service = context.getBean(MemberInsertService.class);
        service.execute(i+"@naver.com", "1234", "1234", "nick"+i);

        MemberSelectedByEmailService service1 = context.getBean(MemberSelectedByEmailService.class);
        service1.execute("songe08@naver.com");

        MemberSelectByEmailAndPassService service2 = context.getBean(MemberSelectByEmailAndPassService.class);
        service2.execute("songe08@naver.com", "1234");
    }
}
