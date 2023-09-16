package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootApplication2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringBootApplication2Application.class, args);
		System.out.println(context.getClass().getName());
	}

}
