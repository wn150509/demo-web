package com.example.springbootjpa.controller;

import com.example.springbootjpa.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@CrossOrigin
@RequestMapping(value = "/book")
public class BookController {

    private static final String BOOK_DETAIL_PATH_NAME = "bookDetail";
    private static final String BOOK_LIST_PATH_NAME = "bookList";
    private static final String BOOK_NAME="bookname";
    private static final String BOOK_CONTAIN="contain";
    private static final String BOOK_ORDER="order";
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
    public String getBook(ModelMap modelMap,String name){
        modelMap.addAttribute("bookname",bookService.findByName(name));
        return BOOK_NAME;
    }
    @GetMapping("/contain")
    public String getContain(ModelMap modelMap,String keyword){
        modelMap.addAttribute("contain",bookService.findByTypeIsContaining(keyword));
        return BOOK_CONTAIN;
    }
    @GetMapping("/order")
    public String getorder(ModelMap modelMap,String key){
        modelMap.addAttribute("order",bookService.findBook(key));
        return BOOK_ORDER;
    }
}
