package com.devops.helloworld.service.impl;

import com.devops.helloworld.repositery.HelloWorldRepository;
import com.devops.helloworld.service.HelloWorldService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HelloWorldServiceImpl implements HelloWorldService {

    private final HelloWorldRepository helloWorldRepository;
    @Override
    public String getHelloWorld() {
        return helloWorldRepository.getById(1L).getName();
    }
}
