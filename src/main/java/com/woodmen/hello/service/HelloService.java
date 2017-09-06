package com.woodmen.hello.service;

import com.woodmen.hello.domain.Hello;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public Hello helloWorld() {
        return new Hello("Hello World!");
    }
}
