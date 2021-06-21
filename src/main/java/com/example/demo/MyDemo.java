package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyDemo {

	public static void main(String[] args) {
		SpringApplication.run(MyDemo.class, args);
	}
	
	@GetMapping("/hi")
	public String hello(@RequestParam(name="name", defaultValue="China") String name) {
		return String.format("Hello %s!", name);
	}

}
