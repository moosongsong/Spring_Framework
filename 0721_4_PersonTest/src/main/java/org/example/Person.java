package org.example;

import java.util.HashMap;

public class Person {
    private String name;
    private HashMap<String, Integer> hashMap;

    public Person(){

    }

    public Person(String name, HashMap<String, Integer> hashMap) {
        this.name = name;
        this.hashMap = hashMap;
    }

    public int tot(){
        return (hashMap.get("kor")+hashMap.get("math")+hashMap.get("eng"));
    }

    public double avg(){
        return (double)tot()/3;
    }

    public void print(){
        System.out.println(name+", "+hashMap.get("kor")+", "+hashMap.get("eng")
                +", "+hashMap.get("math")+", "+tot()+", "+avg());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Integer> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<String, Integer> hashMap) {
        this.hashMap = hashMap;
    }
}
