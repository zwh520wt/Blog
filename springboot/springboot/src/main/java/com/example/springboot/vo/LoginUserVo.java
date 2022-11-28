package com.example.springboot.vo;

import lombok.Data;

/***
 * @author Z
 * 对登录信息的返回值进行封装
 */
@Data
public class LoginUserVo {
    private String id;

    private String account;

    private String nickname;

    private String avatar;

}
