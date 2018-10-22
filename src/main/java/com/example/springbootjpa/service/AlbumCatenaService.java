package com.example.springbootjpa.service;

import com.example.springbootjpa.entity.AlbumCatena;
import io.swagger.models.auth.In;

import java.util.List;

public interface AlbumCatenaService {
    List<AlbumCatena>findAlbumCatenas(Integer id);
}
