package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    @Scope("prototype")
    public String name(){
        return "KimSeokJin";
        // String으로는 판가름 불가하다. 가리키는 주소가 같아서
    }

    @Bean
    public List<String>list(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Min");
        list.add("V");
        return list;
    }
}
