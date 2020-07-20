package com.company;

public class Main {

    public static void main(String[] args) {
        Member member = new Member();
        member.setName("sing");
        System.out.println(member);

        Member member1 = MemberCreator.getInstance();
//        member1.setName("kim");
        System.out.println(member1);
    }
}
