package com.awiwa.primeiro_projeto_spring.controller;

import com.awiwa.primeiro_projeto_spring.domain.User;
import com.awiwa.primeiro_projeto_spring.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public String helloWorld(){
        return helloWorldService.helloWorld("Osterkamp");
    }

    @PostMapping("/{id")
    public String helloWorldPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body){
        return "Hello World " + body.getName() + id + filter;
    }
}
