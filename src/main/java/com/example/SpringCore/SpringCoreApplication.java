package com.example.SpringCore;

import com.example.SpringCore.component.DemoBean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Spring Concept Demo");

		ApplicationContext context = SpringApplication.run(SpringCoreApplication.class, args);

		System.out.println("Checking Context: " + context.getBean(DemoBean.class));
	}
}
