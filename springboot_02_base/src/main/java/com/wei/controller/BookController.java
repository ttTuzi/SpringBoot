package com.wei.controller;

import com.wei.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年02月19日 5:18 PM
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @Value("${tempDir}")
    private String tempDir;

    @Autowired
    private MyDataSource myDataSource;

    @GetMapping
    public String getBookById(){
        System.out.println("tempDir"+tempDir);
        System.out.println("hello spring boot...");
        System.out.println(myDataSource);
        return "hello spring boot..";
    }
}
