package com.example.SpringBootwithdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class SpringBootWithDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithDockerApplication.class, args);
	}

}
