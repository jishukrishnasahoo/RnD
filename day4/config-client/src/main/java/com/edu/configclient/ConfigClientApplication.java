package com.edu.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
@RefreshScope
public class ConfigClientApplication {

	@Value("${my-property}")
	private String myProperty;
	@Value("${your-property}")
	private String yourProperty;

	@GetMapping("/properties")
	public Map<String, String> getProperties() {
		HashMap<String, String> map = new HashMap<>();
		map.put("myProperty", myProperty);
		map.put("yourProperty", yourProperty);
		return map;
	}

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

}
