package com.example.springbootjpa.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Album {
    @Id
    @GeneratedValue
    private Integer id;

//    @OneToMany(fetch = FetchType.EAGER,cascade = {CascadeType.REMOVE})
//    @JoinColumn(name = "album_id")
//    private List<AlbumCatena> albumCatenaList;

    private String albumCover;

    private String albumTitle;

    private String albumDescription;

    private Integer likes;
}
