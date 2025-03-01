package com.example.SpringCore.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DemoBean {

    private static final Logger logger = LoggerFactory.getLogger(DemoBean.class);

    public DemoBean() {
        logger.info("DemoBean initialized!");
    }

    public String sayHello() {
        logger.debug("Executing sayHello() method.");
        return "Hello from DemoBean!";
    }

    @Override
    public String toString() {
        return "DemoBean is initialized!";
    }
}
