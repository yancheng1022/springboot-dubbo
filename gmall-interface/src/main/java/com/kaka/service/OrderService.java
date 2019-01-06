package com.kaka.service;

import com.kaka.bean.UserAddress;

import java.util.List;

public interface OrderService {
    public List<UserAddress> initOrder(String userId);
}
