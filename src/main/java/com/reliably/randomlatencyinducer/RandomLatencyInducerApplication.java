package com.reliably.randomlatencyinducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RandomLatencyInducerApplication {

	@RequestMapping("/")
	public String home() {
		return "Am I delayed??";
	}

	public static void main(String[] args) {
		SpringApplication.run(RandomLatencyInducerApplication.class, args);
	}
}
