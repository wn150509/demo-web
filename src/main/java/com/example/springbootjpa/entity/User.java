package com.example.springbootjpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
* 1、用@Entity注解标注本类是一个可持久化类
* 2、用@ID注解指定主键
* 3、用@GeneratorValue注解标注主键策略、MySQL自增
* 4、用@Data注解简化User类
* */
@Entity
@Data
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String userName;
    private String avatar;
}
