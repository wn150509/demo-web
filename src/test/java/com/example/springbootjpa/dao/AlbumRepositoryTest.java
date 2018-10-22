package com.example.springbootjpa.dao;

import com.example.springbootjpa.entity.Album;
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
public class AlbumRepositoryTest {

    @Resource
    private AlbumRepository albumRepository;
    @Test
    public void findHot() throws Exception {
        List<Album>albums=albumRepository.findHot();
        albums.forEach(album -> System.out.println(album));
    }
    @Test
    public void insertalbum(){
        String [] covers={"https://ws1.sinaimg.cn/large/00792MPDgy1fvg20swsdkj307g07gjro.jpg",
                            "https://ws1.sinaimg.cn/large/00792MPDgy1fvg20t36tpj307g07gglv.jpg",
                            "https://ws1.sinaimg.cn/large/00792MPDgy1fvg20teozvj307g0azwj2.jpg",
                            "https://ws1.sinaimg.cn/large/00792MPDgy1fvg20tlsx9j307g07gdft.jpg"};
        String [] descriptions={"气泡","蝴蝶","激光","蒲公英"};
        String [] title={"气泡","蝴蝶","激光","蒲公英"};
        Integer[] likes={20,30,29,22};
        for (int i=0;i<4;i++){
            Album album=new Album();
            album.setAlbumCover(covers[i]);
            album.setAlbumDescription(descriptions[i]);
            album.setAlbumTitle(title[i]);
            album.setLikes(likes[i]);
            albumRepository.save(album);
        }
    }

}