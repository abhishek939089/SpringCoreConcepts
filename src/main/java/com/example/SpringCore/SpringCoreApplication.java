package com.example.SpringCore;

import com.example.SpringCore.component.DemoBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

	public static final Logger logger = LoggerFactory.getLogger(SpringCoreApplication.class);

	public static void main(String[] args) {
		logger.debug("Welcome to Spring Concept Demo");

		ApplicationContext context = SpringApplication.run(SpringCoreApplication.class, args);

		logger.debug("Checking Context: {}", context.getBean(DemoBean.class));

		logger.debug("\n*** Example Using @Autowired annotation on property ***");
	}
}
