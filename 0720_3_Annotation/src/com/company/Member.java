package com.company;

public class Member {
    @InitValue
    private String name;
    private int age;

    public Member(){
        this("none", 20);
    }

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @DefaultMethod
    public void print(){
        System.out.println("Member{" + "name='" + name + '\'' + ", age=" + age + '}');
    }

    @Override
    public String toString() {
        return "Member{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
