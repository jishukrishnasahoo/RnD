package com.edu.orderms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController{

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderController.class);

    @GetMapping("/hello")
    public String getHello() {
        LOGGER.info("Hello sevice");
        return "Hello service";
    }
}