package com.wei.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
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
public class BookServiceTestOld {

    @Autowired
    private BookService bookService;

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

        book.setType("测试数据");
        book.setName("测试数据");
        book.setName("测试数据");
        book.setDescription("测试数据");
        bookService.update(book);
    }
    @Test
    void testDelete() {
        bookService.delete(462733317);
    }

    @Test
    void testGetAll() {
        bookService.getAll();

    }

    @Test
    void testGetByPage(){
        IPage<Book> page = bookService.getPage(2, 5);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getRecords());
    }
}
