package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("partTime")
@Scope("prototype")
public class PartTime implements Employee {
    @Value("none")
    private String name;
    @Value("0")
    private int workTime;
    @Value("0")
    private int payPerTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    public int getPayPerTime() {
        return payPerTime;
    }

    public void setPayPerTime(int payPerTime) {
        this.payPerTime = payPerTime;
    }

    @Override
    public String toString() {
        return "계약직 {" + "name='" + name + '\'' + ", pay=" + pay() + '}';
    }

    @Override
    public int pay() {
        return payPerTime*workTime;
    }
}
