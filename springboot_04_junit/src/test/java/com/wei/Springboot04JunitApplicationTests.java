package com.wei;

import com.wei.dao.impl.ImplDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot04JunitApplicationTests {

    //1.注入对象
    @Autowired
    private ImplDao bookDAO;

    @Test
    void contextLoads() {

        bookDAO.save();
        System.out.println("test");
    }

}
