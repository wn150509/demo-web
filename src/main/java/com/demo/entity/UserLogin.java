package com.demo.entity;

import lombok.Data;

@Data
public class UserLogin {
    private String phone;
    private String password;

    private String ip;

    public UserLogin(String phone, String password,String ip) {
        this.phone = phone;
        this.password = password;
        this.ip=ip;
    }

    public UserLogin() {
    }
}
