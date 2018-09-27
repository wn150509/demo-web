package com.example.springbootjpa.dao;

import com.example.springbootjpa.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsersRepository extends JpaRepository<Users,Long>{
    Users findByAccount(String accout);

    List<Users>findByNicknameStartingWith(String keywords);

    Users findByNicknameStartingWithAndFansBefore(String keywords,Integer num);

    List<Users>findByFansBetween(Integer num1,Integer num2);

//    @Query("from Users  u  where  u.nickname=:nickname")
//    Users  findUser(@Param("nickname")  String  nickname);
}
