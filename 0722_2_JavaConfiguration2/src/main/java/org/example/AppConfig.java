package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Manager manager(){
        Manager manager = new ImplementManager();
        manager.addEmployee(new Regular("hong", 300));
        manager.addEmployee(new PartTime("kim", 200));
        return manager;
    }
}
