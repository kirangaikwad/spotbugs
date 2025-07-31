package com.spotbugs.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpotbugsApplication {

	public static void main(String[] args) {
		String string= getNullString();
		System.out.println(string.length());
		SpringApplication.run(SpotbugsApplication.class, args);
	}
	static String getNullString() {
		return null;
	}
}
