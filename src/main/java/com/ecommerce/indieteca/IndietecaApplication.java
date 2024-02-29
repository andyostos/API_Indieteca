package com.ecommerce.indieteca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ecommerce.indieteca")
public class IndietecaApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndietecaApplication.class, args);
	}

}
