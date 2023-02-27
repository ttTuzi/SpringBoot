package com.wei.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wei.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年02月23日 2:10 PM
 */
@SpringBootTest
public class BookServiceTest {

    @Autowired
    private IBookService bookService;

    @Test
    void testById(){
        System.out.println(bookService.getById(1));
    }

    @Test
    void testSave() {
        Book book = new Book();

        book.setType("测试数据");
        book.setName("测试数据");
        book.setName("测试数据");
        book.setDescription("测试数据");
        bookService.save(book);
    }
    @Test
    void testUpdate() {
        Book book = new Book();
        book.setId(13);
        book.setType("测试数据");
        book.setName("测试数据");
        book.setName("测试数据");
        book.setDescription("测试数据");
        bookService.updateById(book);
    }
    @Test
    void testDelete() {
        bookService.removeById(462733317);
    }

    @Test
    void testGetAll() {
        bookService.list();

    }

    @Test
    void testGetByPage(){
        IPage<Book> page = new Page<>(2,5);
        bookService.page(page);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getRecords());
    }
}
