package com.example.SpringCore.component;

import org.springframework.stereotype.Component;

@Component
public class DemoBean {

    public String sayHello() {
        return "Hello from DemoBean!";
    }

    @Override
    public String toString() {
        return "DemoBean is initialized!";
    }
}
