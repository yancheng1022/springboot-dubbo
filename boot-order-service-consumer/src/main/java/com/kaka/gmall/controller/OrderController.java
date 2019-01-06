package com.kaka.gmall.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.kaka.bean.UserAddress;
import com.kaka.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/initOrder")
    public List<UserAddress> initOrder(@RequestParam("uid")String userId){
        return orderService.initOrder(userId);
    }
}
