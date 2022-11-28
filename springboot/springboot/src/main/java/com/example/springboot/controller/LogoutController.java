package com.example.springboot.controller;

import com.example.springboot.service.LoginService;
import com.example.springboot.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * 退出登录
 * @author Z
 */
@RestController
@RequestMapping("logout")
public class LogoutController {

    @Autowired
    private LoginService loginService;

    @GetMapping("")
    public Result logout(@RequestHeader("Authorization") String token) {
        return loginService.logout(token);
    }
}
