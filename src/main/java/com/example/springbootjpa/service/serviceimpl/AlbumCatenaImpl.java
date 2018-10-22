package com.example.springbootjpa.service.serviceimpl;

import com.example.springbootjpa.dao.AlbumCatenaRepository;
import com.example.springbootjpa.dao.AlbumRepository;
import com.example.springbootjpa.entity.AlbumCatena;
import com.example.springbootjpa.service.AlbumCatenaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AlbumCatenaImpl implements AlbumCatenaService {
    @Resource
    private AlbumCatenaRepository albumCatenaRepository;
    @Override
    public List<AlbumCatena> findAlbumCatenas(Integer id) {
        return albumCatenaRepository.findAlbumCatenas(id);
    }
}
