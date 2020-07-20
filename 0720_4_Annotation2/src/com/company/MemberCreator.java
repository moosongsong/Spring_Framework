package com.company;

import java.lang.reflect.Field;

public class MemberCreator {
    public static Member getInstance(){
        Member member = new Member();
        Field [] fields = member.getClass().getDeclaredFields();
        for (Field field : fields) {
            InitValue initValue= field.getDeclaredAnnotation(InitValue.class);
            StrValue strValue = field.getDeclaredAnnotation(StrValue.class);
            if (initValue != null){
                if (field.getType() == int.class){
                    int value = initValue.value();
                    field.setAccessible(true);
                    try {
                        field.set(member, value);
                    } catch (IllegalAccessException e) {
//                    e.printStackTrace();
                    }
                }else if(field.getType() == String.class){
                    String str = initValue.defaultName();
                    field.setAccessible(true);
                    try {
                        field.set(member, str);
                    } catch (IllegalAccessException e) {
//                    e.printStackTrace();
                    }
                }
            }
            if (strValue != null){
                String str = strValue.str();
                field.setAccessible(true);
                try {
                    field.set(member, str);
                } catch (IllegalAccessException e) {
//                    e.printStackTrace();
                }
            }
        }
        return member;
    }
}
