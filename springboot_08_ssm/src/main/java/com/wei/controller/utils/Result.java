package com.wei.controller.utils;

import com.wei.pojo.Book;
import lombok.Data;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年02月24日 3:03 PM
 */

@Data
public class Result {
    private Boolean flag;
    private Object data;
    private String msg;
    public Result() {
    }


    public Result(Boolean flag){
        this.flag=flag;
    }

    public Result(Boolean flag,Object data){
        this.flag=flag;
        this.data=data;
    }

    public Result(String msg){
        this.flag=false;
        this.msg=msg;
    }
}
