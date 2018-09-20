package com.example.springbootjpa.dao;

import com.example.springbootjpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>{
}
