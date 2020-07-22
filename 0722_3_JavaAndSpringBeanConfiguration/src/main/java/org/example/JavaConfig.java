package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class JavaConfig {
    @Bean
    public List<String> list(){
        ArrayList<String> list = new ArrayList<>();
        list.add("kim");
        list.add("lee");
        return list;
    }

//    @Bean
//    public User user(){
//        User user = new User();
//        user.setUsers((ArrayList<String>) list());
//        return user;
//    }
}
