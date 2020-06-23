package com.demo.controller;

import com.demo.entity.User;
import com.demo.entity.UserLogin;
import com.demo.service.UserService;
import com.demo.util.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@CrossOrigin
@RequestMapping(value = "user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    ResponseUtil register(@RequestBody User user){
        return userService.UserRegister(user);
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    ResponseUtil login(@RequestBody UserLogin userLogin){
        return userService.UserLogin(userLogin);
    }
}
