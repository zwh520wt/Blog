package com.example.springboot.handler;


import com.example.springboot.vo.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/***
 * @author Z
 * 全局异常处理
 * 对加了ControllerAdvice 注解的方法进行拦截处理 AOP的处理
 */
@ControllerAdvice
public class AllExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result doException(Exception e) {
        e.printStackTrace();
        return Result.fail(-999,"系统异常");
    }
}
