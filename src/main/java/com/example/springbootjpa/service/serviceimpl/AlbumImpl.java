package com.example.springbootjpa.service.serviceimpl;

import com.example.springbootjpa.dao.AlbumRepository;
import com.example.springbootjpa.entity.Album;
import com.example.springbootjpa.service.AlbumService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AlbumImpl implements AlbumService {
    @Resource
    private AlbumRepository albumRepository;

    @Override
    public List<Album> getall() {
        return albumRepository.findAll();
    }
}
