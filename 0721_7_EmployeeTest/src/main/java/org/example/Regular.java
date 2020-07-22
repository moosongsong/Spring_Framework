package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("regular")
@Scope("prototype")
public class Regular implements Employee{
    @Value("0")
    private int salary;
    @Value("none")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "정규직 {" + "name='" + name + '\'' + ", pay=" + pay() + '}';
    }

    @Override
    public int pay() {
        return (salary/12);
    }
}
