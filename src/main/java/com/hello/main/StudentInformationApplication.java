package com.hello.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.hello")
public class StudentInformationApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentInformationApplication.class, args);
	}

}
