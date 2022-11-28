package com.example.springboot.controller;

import com.example.springboot.service.LoginService;
import com.example.springboot.vo.Result;
import com.example.springboot.vo.params.LoginParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @author Z
 * 注册功能
 */
@RestController
@RequestMapping("register")
public class RegisterController {

    @Autowired
    private LoginService loginService;


    @PostMapping
    public Result register(@RequestBody LoginParam loginParam) {
        // sso 单点登录，后期如果把登录注册功能踢出去 变为单独的服务，可以独立提供
        return loginService.register(loginParam);
    }
}
