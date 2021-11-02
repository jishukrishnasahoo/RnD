package com.kafka.springbootkafkahelloworldexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SpringBootKafkaHelloWorldExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaHelloWorldExampleApplication.class, args);
	}

}
