package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//Use appropriate annotation to scan the packages
@ComponentScan("com.*")
public class HouseBoatBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HouseBoatBookingApplication.class, args);
		System.out.println("Starting boot........");
	}

}
