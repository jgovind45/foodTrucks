package com.ft.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class FoodTruckApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(FoodTruckApplication.class, args);
	}

}
