package com.example.springbootjpa.controller;

import com.example.springbootjpa.entity.Book;
import com.example.springbootjpa.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/books")
public class BoController {
    @Resource
    private BookService bookService;
    @GetMapping("/all")
    public List<Book>getall(){
        return bookService.getall();
    }
    @GetMapping("/{id}")
    public Book getbyid(@PathVariable Integer id){
        return bookService.getbyid(id);
    }
    @GetMapping("/name")
    public Book getbyname(String name){
        return bookService.findByName(name);
    }
    @GetMapping("/contains")
    public List<Book>getBook(String key){
        return bookService.findByTypeIsContaining(key);
    }
    @GetMapping("/orders")
    public List<Book>getbook(String key){
        return bookService.findBook(key);
    }

}
