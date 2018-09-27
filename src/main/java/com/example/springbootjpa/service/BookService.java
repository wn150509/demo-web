package com.example.springbootjpa.service;

import com.example.springbootjpa.entity.Book;
import com.example.springbootjpa.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookService {
    Book save(Book book);
    List<Book>getall();
    Book getbyid(int id);
    //原生
    //查询所有用户、更具ID查询某一天数据

    //方法名
    Book findByName(String name);
    List<Book> findByTypeIsContaining(String keywords);

    //JPQL语句
    @Query("select u from Book u where u.type like %:keywords% order by u.counts desc")
    List<Book> findBook(@Param("keywords")  String  keywords);
}
