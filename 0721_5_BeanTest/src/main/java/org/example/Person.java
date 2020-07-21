package org.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean, DisposableBean {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
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

    @Override
    public void destroy() throws Exception {
        //객체가 소멸되기 직전
        System.out.println(this+"객체가 소멸됩니다.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this+"객체가 생성되었습니다.");
    }

    public void init() throws Exception {
        System.out.println(this+"객체가 생성되었습니다.init");
    }
}
