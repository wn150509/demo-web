package com.example.springbootjpa.service.serviceimpl;

import com.example.springbootjpa.dao.BookRepository;
import com.example.springbootjpa.entity.Book;
import com.example.springbootjpa.entity.User;
import com.example.springbootjpa.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookImpl implements BookService {
    @Resource
    private BookRepository bookRepository;
    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getall() {
        return bookRepository.findAll();
    }

    @Override
    public Book getbyid(int id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public Book findByName(String name) {
        return bookRepository.findByName(name);
    }

    @Override
    public List<Book> findByTypeIsContaining(String keywords) {
        return bookRepository.findByTypeIsContaining(keywords);
    }

    @Override
    public List<Book> findBook(String keywords) {
        return bookRepository.findBook(keywords);
    }
}
