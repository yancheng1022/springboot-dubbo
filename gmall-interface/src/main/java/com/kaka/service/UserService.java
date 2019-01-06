package com.kaka.service;


import com.kaka.bean.UserAddress;

import java.util.List;

public interface UserService {
    public List<UserAddress> getAddressList(String userId);
}
