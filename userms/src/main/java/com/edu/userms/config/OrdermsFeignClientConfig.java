package com.edu.userms.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "orderms")
public interface OrdermsFeignClientConfig {
    @RequestMapping(method = RequestMethod.GET,
    value = "/order/hello", consumes = "application/json")
    public String getAllOrders();
}
