package com.test.testTgid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan(basePackages = {"model", "view", "controller"})
@SpringBootApplication
public class TestTgidApplication {
	
    public static void main(String[] args) { 
            SpringApplication.run(TestTgidApplication.class, args);
    }
}