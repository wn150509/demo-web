package com.example.springbootjpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
public class AlbumCatena {
    @Id
    @GeneratedValue
    private Integer id;
    private String picture;
    private String title;
    private Integer album_id;

}
