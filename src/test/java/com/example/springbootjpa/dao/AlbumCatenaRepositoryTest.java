package com.example.springbootjpa.dao;

import com.example.springbootjpa.entity.AlbumCatena;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlbumCatenaRepositoryTest {

    @Resource
    private AlbumCatenaRepository albumCatenaRepository;
    @Test
    public void findall() throws Exception {
        List<AlbumCatena>albumCatenas= albumCatenaRepository.findAlbumCatenas(1);
        albumCatenas.forEach(albumCatena -> System.out.println(albumCatena));
//        System.out.println(albumCatenaRepository.findAlbumCatenaById(1));

    }

}