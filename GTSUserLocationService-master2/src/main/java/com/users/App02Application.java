package com.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.convert.Jsr310Converters;

@SpringBootApplication
@EntityScan(basePackageClasses = {App02Application.class , Jsr310Converters.class})
public class App02Application {

	public static void main(String[] args) {
		SpringApplication.run(App02Application.class, args);
	}

}
