package com.bblwq.home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

 	@GetMapping("/")
	public String hello() {
		return "Hello world! This app was built by Cloud Build triggered by bblwq/google-cloud.";
	}
}
