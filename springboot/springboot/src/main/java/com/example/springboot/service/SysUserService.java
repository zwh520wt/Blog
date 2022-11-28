package com.example.springboot.service;


import com.example.springboot.dao.pojo.SysUser;
import com.example.springboot.vo.Result;
import com.example.springboot.vo.UserVo;

/***
 * @author Z
 * 个人信息表
 */
public interface SysUserService {

    /***
     * 根据id查找作者信息
     * @param id
     * @return
     */
    UserVo findUserVoById(Long id);

    /***
     * id查询用户
     * @param id
     * @return
     */
    SysUser findUserById(Long id);

    /***
     * 验证账号，密码
     * @param account
     * @param password
     * @return
     */
    SysUser findUser(String account, String password);

    /***
     * 根据token查询用户信息
     * @param token
     * @return
     */
    Result findUserByToken(String token);

    /***
     * 根据账号查找用户信息
     * @param account
     * @return
     */
    SysUser findUserByAccount(String account);

    /***
     * 保存用户
     * @param sysUser
     */
    void save(SysUser sysUser);
}
