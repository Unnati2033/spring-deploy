package com.example.myapp;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class MyAppApplication {
	
	@GetMapping("/")
	public  String welcome() {
		return "welcome to openshift";

	}
	@GetMapping("/{input}")
	public  String congrats(@PathVariable String input) {
		return "Hi "+input+"your application deployed" ;

	}

	public static void main(String[] args) {
		SpringApplication.run(MyAppApplication.class, args);
	}

}
