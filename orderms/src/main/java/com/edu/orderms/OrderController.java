package com.edu.orderms;

import com.edu.orderms.model.Order;
import com.edu.orderms.repo.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.PathParam;

@RestController
@RequestMapping("/order")
public class OrderController{
    private OrderRepository orderRepository;


    @Autowired
    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderController.class);

    @GetMapping("/hello")
    public String getHello() {
        LOGGER.info("Hello sevice");
        return "Hello service";
    }

    @GetMapping("/{id}")
    public ResponseEntity getOrder(@PathParam("id") Long id)
    {
        Order result = orderRepository.getById(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}