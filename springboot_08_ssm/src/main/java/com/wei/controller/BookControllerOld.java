package com.wei.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wei.pojo.Book;
import com.wei.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年02月24日 1:46 PM
 */

//@RestController
//@RequestMapping("/books")
public class BookControllerOld {

    @Autowired
    private IBookService bookService;

    @GetMapping
    public List<Book> getAll(){
     return bookService.list();
    }

    @PostMapping
    public Boolean save(@RequestBody Book book){
        return bookService.save(book);
    }

    @PutMapping
    public Boolean update(@RequestBody Book book){
        return bookService.updateById(book);
    }

    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id){
        return bookService.removeById(id);
    }

    @GetMapping("{id}")
    public Book getById(@PathVariable Integer id){
        return bookService.getById(id);
    }

    @GetMapping("{currPage}/{pageSize}")
    public IPage<Book> getPage(@PathVariable int currPage, @PathVariable int pageSize){
        return bookService.getPage(currPage,pageSize);
    }
}
