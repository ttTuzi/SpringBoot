package com.wei.dao;

import com.wei.domain.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.awt.print.Book;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年02月22日 2:58 PM
 */
@Mapper
public interface EmpDAO {

    @Select("select * from t_emp where age=${20}")
    public Emp getById(Integer id);

}
