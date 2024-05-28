package com.bueno.simpleApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SimpleAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SimpleAppApplication.class, args);
		//old way of creating object before spring framework
		//Dev dev = new Dev();

		//After spring, new way of creating object
		//Dev dev = context.getBean(Dev.class);
		//dev.build();
}}
