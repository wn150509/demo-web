package com.demo.dao;


import com.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findUserByCellphone(String phone);//通过手机号查找用户

    User findUserByUserId(Integer id);//通过用户Id查找用户
}
