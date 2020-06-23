package com.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class User {

    @GeneratedValue
    @Id                     //id自增
    private Integer userId;//用户id 主键

    @Column(nullable = false)//非空
    private String userName; //用户名

    @Column(nullable = false)//非空
    private String email; //用户邮箱

    @Column(nullable = false)//非空
    private String cellphone; //用户电话

    @Column(nullable = false)//非空
    private String password; //密码

    @Column(nullable = false)//非空
    private String salt; //加密手段（加盐）

    @Column(nullable = false)//非空
    private Integer state; //状态（0表示删除，1表示正常）

    @Column(nullable = false)
    private Date createTime;//创建用户时间

    public User() {
    }
}
