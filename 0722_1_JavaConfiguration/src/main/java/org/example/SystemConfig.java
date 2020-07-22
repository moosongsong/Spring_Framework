package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class SystemConfig {
    @Bean
    public Map<String, Integer> map(){
        HashMap<String, Integer>map = new HashMap<>();
        map.put("kor", 100);
        map.put("eng", 80);
        map.put("math", 90);
        return map;
    }
}
