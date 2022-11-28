package com.example.springboot.service;

import com.example.springboot.dao.pojo.SysUser;
import com.example.springboot.vo.Result;
import com.example.springboot.vo.params.LoginParam;

/**
 * @author Z
 * 登录接口
 */

public interface LoginService {

    /***
     * 登录接口
     * @param loginParam
     * @return
     */
    Result login(LoginParam loginParam);

    /***
     * 校验token
     * @param token
     * @return
     */
    SysUser checkToken(String token);

    /***
     * 退出登录
     * @param token
     * @return
     */
    Result logout(String token);

    /***
     * 注册
     * @param loginParam
     * @return
     */
    Result register(LoginParam loginParam);

}
