package org.example.vo;

public class Member {
    private String name;
    private int age;

    // 객체가 우선 만들어져야 setter injectiond을 쓸수 있는데,
    // 만약 기본 생성자가 없다면 오류가 발생한다.
    public Member(){
        this("none", 0);
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

    @Override
    public String toString() {
        return "Member{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
