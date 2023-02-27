package com.wei.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wei.controller.utils.Result;
import com.wei.pojo.Book;
import com.wei.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年02月24日 1:46 PM
 */

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookService bookService;

    @GetMapping
    public Result getAll(){
        return new Result(true,bookService.list());
    }

    @PostMapping
    public Result save(@RequestBody Book book) throws IOException {
        if(book.getName().equals("123"))throw new IOException();
        return new Result(bookService.save(book));
    }

    @PutMapping
    public Result update(@RequestBody Book book){
        return new Result(bookService.updateById(book));
    }

    @DeleteMapping("{id}")
    public Result delete(@PathVariable Integer id){
        return new Result(bookService.removeById(id));
    }

    @GetMapping("{id}")
    public Result getById(@PathVariable Integer id){
        return new Result(true,bookService.getById(id));
    }

//    @GetMapping("{currPage}/{pageSize}")
//    public Result getPage(@PathVariable int currPage, @PathVariable int pageSize){
//        IPage<Book> page = bookService.getPage(currPage, pageSize);
//        if(currPage>page.getPages()){
//            page = bookService.getPage((int) page.getPages(),pageSize);
//        }
//        return new Result(true,page);
//    }

    @GetMapping("{currPage}/{pageSize}")
    public Result getPage(@PathVariable int currPage, @PathVariable int pageSize,String name, Book book){
//        System.out.println("参数===>"+name);
//        System.out.println("参数===>"+book);
//        IPage<Book> page = bookService.getPage(currPage, pageSize,book);
        IPage<Book> page = bookService.getPage(currPage, pageSize,book);
        if(currPage>page.getPages()){
            page = bookService.getPage((int) page.getPages(),pageSize,book);
        }
        return new Result(true,page);
    }
}
