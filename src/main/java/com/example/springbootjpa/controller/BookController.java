package com.example.springbootjpa.controller;

import com.example.springbootjpa.entity.Book;
import com.example.springbootjpa.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/book")
public class BookController {

    private static final String BOOK_DETAIL_PATH_NAME = "bookDetail";
    private static final String BOOK_LIST_PATH_NAME = "bookList";
    @Resource
    private BookService bookService;

    @GetMapping("/all")
    public String getall(ModelMap modelMap){
        modelMap.addAttribute("bookList",bookService.getall());
        return BOOK_LIST_PATH_NAME;
    }

    @GetMapping("/{id}")
    public String getbyid(@PathVariable Integer id,ModelMap modelMap){
        modelMap.addAttribute("book",bookService.getbyid(id));
        return BOOK_DETAIL_PATH_NAME;
    }
    @GetMapping("/name")
    public String getBook(ModelMap modelMap){

    }
}
