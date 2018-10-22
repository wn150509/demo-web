package com.example.springbootjpa.dao;

import com.example.springbootjpa.entity.AlbumCatena;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlbumCatenaRepository extends JpaRepository<AlbumCatena,Integer> {
    AlbumCatena findAlbumCatenaById(Integer id);

    @Query("select u from AlbumCatena u where u.album_id=?1")
    List<AlbumCatena>findAlbumCatenas(Integer id);

}
