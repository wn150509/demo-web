package com.example.springbootjpa.dao;

import com.example.springbootjpa.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class BookRepositoryTest {

    @Resource
    BookRepository bookRepository;
    @Test
    public void findByName() throws Exception {
        System.out.println(bookRepository.findByName("白金数据"));
    }

    @Test
    public void findByTypeIsContaining() throws Exception {
        List<Book>books=bookRepository.findByTypeIsContaining("文学");
        books.forEach(book -> System.out.println(book));
    }

    @Test
    public void findBook() throws Exception {
        List<Book>books=bookRepository.findBook("文学");
        books.forEach(book -> System.out.println(book));
    }

}