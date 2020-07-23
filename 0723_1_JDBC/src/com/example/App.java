package com.example;

import com.example.exception.PartException;
import com.example.exception.PartInsertException;
import com.example.service.PartProductInsertService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void func() throws PartException {
        throw new PartInsertException();
    }

    public static void main(String[] args) throws Exception {
        ApplicationContext context =new ClassPathXmlApplicationContext("AppConfig.xml");
//        PartInsertService service = (PartInsertService) context.getBean("partInsertService");
//        service.excute("휴");

//        ProductInsertService service = context.getBean(ProductInsertService.class);
//        service.execute("아이패드", 10000, 3);

        PartProductInsertService service = context.getBean("PartProductInsertService",PartProductInsertService.class);
        service.execute("가구", "키보드", 30000);
    }
}
