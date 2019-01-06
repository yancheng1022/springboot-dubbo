package com.kaka.gmall.service.impl;



import com.kaka.bean.UserAddress;
import com.kaka.service.OrderService;
import com.kaka.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {


    @Autowired
    UserService userService;

    public void initOrder(String userId) {
        List<UserAddress> addressList = userService.getAddressList(userId);
        System.out.println(addressList);
    }
}
