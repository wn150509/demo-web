package com.demo.service;

import com.demo.entity.User;
import com.demo.entity.UserLogin;
import com.demo.util.ResponseUtil;

public interface UserService {
    ResponseUtil UserRegister(User user);//用户注册

    ResponseUtil UserLogin(UserLogin userLogin);//用户登录
}
