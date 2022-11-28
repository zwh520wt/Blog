package com.example.springboot.vo.params;

import lombok.Data;

/**
 * @author Z
 * 登录传过来的数据
 */
@Data
public class LoginParam {
    private String account;

    private String password;

    private String nickname;
}
