package com.example.springbootjpa.controller;

import com.example.springbootjpa.entity.Album;
import com.example.springbootjpa.entity.AlbumCatena;
import com.example.springbootjpa.entity.Book;
import com.example.springbootjpa.service.AlbumCatenaService;
import com.example.springbootjpa.service.AlbumService;
import com.example.springbootjpa.service.BookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/books")
public class BoController {
    @Resource
    private BookService bookService;
    @Resource
    private AlbumService albumService;
    @Resource
    private AlbumCatenaService albumCatenaService;
    @GetMapping("/all")
    public List<Book>getall(){
        return bookService.getall();
    }
//    @GetMapping("/{id}")
//    public Book getbyid(@PathVariable Integer id){
//        return bookService.getbyid(id);
//    }
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
    @GetMapping("/album")
    public List<Album>getallalbum(){
        return albumService.getall();
    }

    @GetMapping("/{id}")
    public List<AlbumCatena>getcatenas(@PathVariable Integer id){
        System.out.println(albumCatenaService.findAlbumCatenas(id));
        return albumCatenaService.findAlbumCatenas(id);
    }
}
