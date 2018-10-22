package com.example.springbootjpa.dao;

import com.example.springbootjpa.entity.Album;
import com.example.springbootjpa.entity.AlbumCatena;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlbumRepository extends JpaRepository<Album,Integer>{
    @Query("select u from Album u order by u.likes desc")
    List<Album>findHot();

    List<Album>findAll();
}
