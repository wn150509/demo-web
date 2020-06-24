package com.demo.service.impl;

import com.demo.dao.UserLoginLogRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {
    @Resource
    private UserLoginLogRepository userLoginLogRepository;
    @Test
    public void loginLog() {
        System.out.println(userLoginLogRepository.findAllByUserId(1));
    }
}