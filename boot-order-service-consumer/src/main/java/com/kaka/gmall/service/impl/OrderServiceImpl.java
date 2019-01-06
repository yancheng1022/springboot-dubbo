package com.kaka.gmall.service.impl;



import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.kaka.bean.UserAddress;
import com.kaka.service.OrderService;
import com.kaka.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;



import java.util.List;

@org.springframework.stereotype.Service
public class OrderServiceImpl implements OrderService {


    @Reference
    UserService userService;

    public List<UserAddress> initOrder(String userId) {
        List<UserAddress> addressList = userService.getAddressList(userId);
        return addressList;
    }
}
