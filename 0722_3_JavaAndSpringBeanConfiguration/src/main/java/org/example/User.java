package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.*;

@Component("user")
public class User {
    @Autowired
    private ArrayList<String> users;
    @Autowired
    @Qualifier("map")
    private Map<String, Integer> scores;

    public void print(){
        for (String name :
                users) {
            System.out.println(name);
        }
    }

    public void setUsers(ArrayList<String> users) {
        this.users = users;
    }

    public void scorePrint(){
        Set<String> ketSet = scores.keySet();
        Iterator<String> iterator = ketSet.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key+", "+scores.get(key));
        }
    }

    public void setScores(Map<String, Integer> scores) {
        this.scores = scores;
    }
}
