package com.example.springbootjpa.service.serviceimpl;

import com.example.springbootjpa.entity.Book;
import com.example.springbootjpa.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookImplTest {
    @Resource
    private BookService bookService;
    @Test
    public void save() throws Exception {
        String []name={"白金数据","盗墓笔记","昆虫记","嫌疑人X的献身","大主宰"};
        String []info={"以防止犯罪为目的，管理受刑人和国民DNA情报的DNA法案在国会表决通过，警察署导入DNA搜查系统，由特殊解析研究所主任神乐龙平负责操作。",
                        "《盗墓笔记》是一本最初连载在起点中文网上的小说，后由中国友谊、时代文艺、上海文化于2007年-2011年陆续出版发行，作者南派三叔。",
                        "该作品是一部概括昆虫的种类、特征、习性和婚习的昆虫生物学著作，记录了昆虫真实的生活，表述的是昆虫为生存而斗争时表现出的灵性，还记载着法布尔痴迷昆虫研究的动因、生平抱负、知识背景、生活状况等等内容。",
                        "该作讲述一个数学天才为了帮助一对母女隐藏杀害前夫的罪行，和警方展开了一连串的斗智，制造整个骗局。",
                        "拥有“八部浮屠”和“一气化三清“，并将”一气化三清“修至三神境，外加真龙真凤之灵结合自成“一气化五身身”；’负八神脉与九神脉，掌握”太灵圣体“、“万古不朽身“、”无尽光明体”三座原始法身“，修成圣品肉身，借助三法身之力于“苍穹榜”上留下姓氏，超脱圣品。"};
        String []type={"悬疑、犯罪","小说、科幻","生物学、教育","长篇小说","异界大陆类玄幻"};
        String []author={"东野圭吾","南派三叔","让-亨利·卡西米尔·法布尔","东野圭吾","天蚕土豆"};
        for(int i=0;i<5;i++){
            Book book=new Book();
            book.setName(name[i]);
            book.setAuthor(author[i]);
            book.setInfo(info[i]);
            book.setType(type[i]);
            book.setPicture(i+".jpg");
            bookService.save(book);
        }
    }

    @Test
    public void getall() throws Exception {
        System.out.println(bookService.getall());
    }

    @Test
    public void getbyid() throws Exception {
        System.out.println(bookService.getbyid(2));
    }

}