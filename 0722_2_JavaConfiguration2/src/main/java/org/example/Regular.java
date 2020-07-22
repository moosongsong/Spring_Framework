package org.example;

public class Regular implements Employee {
    private String name;
    private int salary;
    private static String TYPE = "정규직";

    public Regular(String name, int salary) {
        this.salary=salary;
        this.name=name;
    }

    @Override
    public int pay() {
        return (salary/12);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return TYPE;
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
}
