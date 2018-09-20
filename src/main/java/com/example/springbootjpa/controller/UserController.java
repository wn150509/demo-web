package com.example.springbootjpa.controller;

import com.example.springbootjpa.entity.User;
import com.example.springbootjpa.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/all")
    public List<User> getall(){
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public User get(@PathVariable Integer id){
        return userService.get(id);
    }
}
