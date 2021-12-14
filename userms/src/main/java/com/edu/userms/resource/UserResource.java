package com.edu.userms.resource;

import com.edu.userms.UsermsApplication;
import com.edu.userms.config.OrdermsFeignClientConfig;
import com.edu.userms.model.User;
import com.edu.userms.repo.UserRepository;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserResource.class);
    private final UserRepository userRepository;
    private final OrdermsFeignClientConfig feignClientConfig;

    @Autowired
    public UserResource(UserRepository userRepository, OrdermsFeignClientConfig feignClientConfig) {
        this.userRepository = userRepository;
        this.feignClientConfig = feignClientConfig;
    }

    @GetMapping("/hello")
    public String getHello() {
        LOGGER.info("Hello World");
        return "Hello World";
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/users")
    public User postUser(@RequestBody User user) {
        User newUser = userRepository.save(user);
        return newUser;
    }

    @GetMapping("/users-orders")
    @HystrixCommand(fallbackMethod = "getFromFallback")
    public Object getAllOrders() {
        LOGGER.info("calling orderms");
        return feignClientConfig.getAllOrders();
    }

    public Object getFromFallback() {
        System.out.println("fallback of orderms");
        LOGGER.info("fallback of orderms");
        return Arrays.asList("one", "two");
    }
}
