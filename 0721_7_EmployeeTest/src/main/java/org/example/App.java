package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("AppContext.xml");

        ImplementedManager manager = context.getBean(ImplementedManager.class);
        manager.setEmployees((List<Employee>) context.getBean("list"));
        PartTime partTime = context.getBean(PartTime.class);
        partTime.setName("kim");
        partTime.setPayPerTime(20);
        partTime.setWorkTime(10);
        Regular regular = context.getBean(Regular.class);
        regular.setSalary(1200);
        regular.setName("lee");

        manager.addEmployee(partTime);
        manager.addEmployee(regular);

        manager.pay();
    }
}
