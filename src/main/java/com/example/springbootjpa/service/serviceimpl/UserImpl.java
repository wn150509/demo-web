package com.example.springbootjpa.service.serviceimpl;

import com.example.springbootjpa.dao.UserRepository;
import com.example.springbootjpa.entity.User;
import com.example.springbootjpa.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserImpl implements UserService {
    @Resource
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User get(int id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void delete(int id) {

    }
}
