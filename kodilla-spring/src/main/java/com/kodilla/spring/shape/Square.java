package com.kodilla.spring.shape;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Square implements Shape {

    @Bean
    public String getShapeName() {
        return "This is a square";
    }
}
