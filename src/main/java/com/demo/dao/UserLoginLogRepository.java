package com.demo.dao;

import com.demo.entity.UserLoginLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserLoginLogRepository extends JpaRepository<UserLoginLog,Integer> {
    List<UserLoginLog> findAllByUserId(Integer id);//通过用户id获取该用户登录记录
}
