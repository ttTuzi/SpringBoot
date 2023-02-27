package com.wei.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wei.pojo.Book;

public interface IBookService extends IService<Book> {

    IPage<Book> getPage(int currPage,int pageSize);

    IPage<Book> getPage(int pages, int pageSize, Book book);
}
