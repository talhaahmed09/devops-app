package com.devops.helloworld.controller;


import com.devops.helloworld.service.HelloWorldService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
@RequiredArgsConstructor
public class HelloWorldController {

    @Autowired
    private final HelloWorldService helloWorldService;

    public HelloWorldController() {
        helloWorldService = null;
    }


    @GetMapping
    private String getHelloWorld() {
        return helloWorldService.getHelloWorld();
    }
}
