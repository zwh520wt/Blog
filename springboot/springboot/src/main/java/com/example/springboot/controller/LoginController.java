package com.example.springboot.controller;

import com.example.springboot.service.LoginService;
import com.example.springboot.vo.Result;
import com.example.springboot.vo.params.LoginParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/***
 * 登录 controller
 * @author Z
 */
@RestController
@RequestMapping("login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping
    public Result login(@RequestBody LoginParam loginParam) {
        //登录 验证用户 访问用户表
        return loginService.login(loginParam);
    }
}
