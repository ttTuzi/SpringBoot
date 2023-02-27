package com.wei.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wei.dao.BookDao;
import com.wei.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年02月22日 9:17 PM
 */


@SpringBootTest
class BookDaoTest {

    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById() {
        System.out.println(bookDao.selectById(1));
    }
    @Test
    void testSave() {
        Book book = new Book();

        book.setType("测试数据");
        book.setName("测试数据");
        book.setName("测试数据");
        book.setDescription("测试数据");
        bookDao.insert(book);
    }
    @Test
    void testUpdate() {
        //bookDao.updateById("");
    }
    @Test
    void testDelete() {
        bookDao.deleteById(462733317);
    }

    @Test
    void testGetAll() {
        bookDao.selectList(null);

    }

    @Test
    void testGetBy() {
        String name = "1";
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
        lqw.like(name!=null,Book::getName,name);
        bookDao.selectList(lqw);
    }

    @Test
    void testGetPage() {
        IPage page = new Page(2,5);
        bookDao.selectPage(page,null);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getRecords());
    }
}
