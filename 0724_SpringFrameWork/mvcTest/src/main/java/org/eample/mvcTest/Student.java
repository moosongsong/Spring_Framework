package org.eample.mvcTest;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private Info info;
    List<Integer> jumsu;

    public Student(){
        this(new Info(), new ArrayList<Integer>());
    }

    public Student(Info info, List<Integer> jumsu) {
        this.info = info;
        this.jumsu = jumsu;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public List<Integer> getJumsu() {
        return jumsu;
    }

    public void setJumsu(List<Integer> jumsu) {
        this.jumsu = jumsu;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(info.toString());
        for (Integer i : jumsu){
            sb.append(" "+i);
        }
        return sb.toString();
    }
}
