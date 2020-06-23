package com.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class UserLoginLog {
    @GeneratedValue
    @Id                     //id自增
    private Integer loginId;//登录id 主键

    @Column(nullable = false)//非空
    private Integer userId;//登录用户Id

    @Column(nullable = false)//非空
    private Date loginTime;//登录用户时间

    @Column(nullable = false)
    private String loginIp;//登录用户IP

    public UserLoginLog() {
    }
}
