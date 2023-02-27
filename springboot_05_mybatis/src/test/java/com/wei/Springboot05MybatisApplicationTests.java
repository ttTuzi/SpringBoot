package com.wei;

import com.wei.dao.EmpDAO;
import com.wei.domain.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.print.Book;


@SpringBootTest
class Springboot05MybatisApplicationTests {

    @Autowired
    private EmpDAO empDao;

    @Test
    void contextLoads() {
        Emp byId = empDao.getById(1);
        System.out.println(byId);

    }


}
