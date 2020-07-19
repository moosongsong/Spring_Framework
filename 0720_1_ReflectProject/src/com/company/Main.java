package com.company;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        // =========================== 1 ==============================
        Member member = new Member("홍길동", 20);
//		member.print();
        Class<?> cls = member.getClass();
        // 런타임에 해당 정보를 취득한다.
//        Class<?> cls2 = Member.class;
        // 럳타임이 아닌 컴파일 타임에 해당 정보를 취득한다.


        System.out.println("=== fields ===");
		Field[] fields = cls.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getName());
		}

        System.out.println("=== methods ===");
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        System.out.println("=== constructor ===");
        Constructor[] constructors = cls.getConstructors();
        for (Constructor constructor:constructors) {
            System.out.println(constructor.getName());
        }


        // =========================== 2 ==============================
        try {
            Member member2 = (Member)cls.newInstance();
            member2.print();
        } catch (InstantiationException | IllegalAccessException e) {
            System.out.println("못찾음");
        }


        // =========================== 3 ==============================
        Member member3;
        try {
            Constructor<?> constructor = cls.getDeclaredConstructor(String.class, int.class);
            member3 = (Member) constructor.newInstance("meme", 30);
            member3.print();
        } catch (NoSuchMethodException | InvocationTargetException |
                InstantiationException | IllegalAccessException | SecurityException e) {
            System.out.println("못찾음");
        }


        // =========================== 4 ==============================
        Member member1 = new Member("song", 23);
        Class<?> aClass = member1.getClass();

        try { // setName 찾아서 이름 바꾸기
            Method method = aClass.getDeclaredMethod("setName", String.class);
            method.invoke(member1, "kim");
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            System.out.println("못찾음");
        }

        try { // 이름이 잘 바뀌었는지 출력 해보기
            Method method2 = aClass.getDeclaredMethod("print");
            method2.invoke(member1);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            System.out.println("못찾음");
        }

        
    }
}
