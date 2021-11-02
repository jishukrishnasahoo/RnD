package com.edu.kafkaproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KafkaproducerApplication {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	@GetMapping("/messages/{message}")
	public String sendMessage(@PathVariable String message) {
		kafkaTemplate.send("mytopic", message);
		return message;
	}
	public static void main(String[] args) {
		SpringApplication.run(KafkaproducerApplication.class, args);
	}

}
