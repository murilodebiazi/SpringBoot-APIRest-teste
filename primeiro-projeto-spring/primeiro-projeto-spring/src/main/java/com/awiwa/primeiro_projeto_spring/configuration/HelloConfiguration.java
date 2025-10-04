package com.awiwa.primeiro_projeto_spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfiguration {

    @Bean
    public Transport sdkAWS() {
        return new Car();
    }
}
