package com.wei.dao.impl;

import com.wei.dao.DAO;
import org.springframework.stereotype.Repository;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年02月20日 3:21 PM
 */
@Repository
public class ImplDao implements DAO {
    @Override
    public void save() {
        System.out.println("save");
    }
}
