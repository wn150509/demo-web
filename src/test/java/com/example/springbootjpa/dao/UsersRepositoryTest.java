package com.example.springbootjpa.dao;

import com.example.springbootjpa.entity.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersRepositoryTest {

    @Resource
    UsersRepository usersRepository;

    @Test
    public void findByAccount() throws Exception {
        System.out.println(usersRepository.findByAccount("aaa"));
    }

    @Test
    public void findByNicknameStartingWith() throws Exception {
        List<Users>usersList=usersRepository.findByNicknameStartingWith("简");
        usersList.forEach(users -> System.out.println(users));
    }

    @Test
    public void findByNicknameStartingWithAndFansBefore() throws Exception {
        Users users=usersRepository.findByNicknameStartingWithAndFansBefore("简",1000);
        System.out.println(users);
    }

    @Test
    public void findByFansBetween() throws Exception {
        List<Users>usersList=usersRepository.findByFansBetween(500,2000);
        usersList.forEach(users -> System.out.println(users));
    }


    @Test
    public void save(){
        String [] account={"aaa","bbb","ccc","ddd","fff"};
        String [] nickname={"简书","简单","简介","你好","哈哈"};
        Integer [] fans={1222,1111,234,654,223};
        for (int i=0;i<5;i++){
            Users users=new Users();
            users.setAccount(account[i]);
            users.setPassword(account[i]);
            users.setNickname(nickname[i]);
            users.setFans(fans[i]);
            usersRepository.save(users);
        }
    }

//    @Test
//    public void findUser(){
//        System.out.println(usersRepository.findUser("简书"));
//    }
}