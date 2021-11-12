package com.vlkozlov.appwithwebstarter;

import com.vlkozlov.customstarter.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class AppWithWebStarterApplication {
	@Autowired
	private CustomService customService;

	@PostConstruct
	public void printRandomTemperature() {
		System.out.println(customService.getRandomTemperature());
	}

	public static void main(String[] args) {
		SpringApplication.run(AppWithWebStarterApplication.class, args);
	}
}
