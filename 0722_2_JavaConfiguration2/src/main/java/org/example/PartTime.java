package org.example;

public class PartTime implements Employee {
    private String name;
    private int salary;
    private int workTime;
    private static String TYPE = "계약직";

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    public PartTime(String name, int salary) {
        this.salary=salary;
        this.name=name;
        this.workTime = 10;
    }

    @Override
    public int pay() {
        return salary*workTime;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return TYPE;
    }
}
