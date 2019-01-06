package com.kaka.bean;

import java.io.Serializable;

public class UserAddress implements Serializable {
    private String userId;
    private String address;

    public UserAddress(String userId, String address) {
        this.userId = userId;
        this.address = address;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "userId='" + userId + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
