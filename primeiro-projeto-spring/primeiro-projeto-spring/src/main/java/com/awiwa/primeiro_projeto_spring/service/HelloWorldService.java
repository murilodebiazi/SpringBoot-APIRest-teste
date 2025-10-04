package com.awiwa.primeiro_projeto_spring.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String helloWorld(String name){
        return "Hello" + name;
    }
}
