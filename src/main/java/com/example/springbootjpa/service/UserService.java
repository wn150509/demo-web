package com.example.springbootjpa.service;

import com.example.springbootjpa.entity.User;

import java.util.List;

public interface UserService {
    User save(User user);
    List<User>getAll();
    User get(int id);
    void delete(int id);
}
