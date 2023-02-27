package com.wei.controller.utils;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年02月24日 11:18 PM
 */
//spring mvc的异常处理器
@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler
    public Result diException(Exception exception){
        exception.printStackTrace();
        return new Result("服务器故障");
    }

}
