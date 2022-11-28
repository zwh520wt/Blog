package com.example.springboot.dao.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/***
 * //    @TableId(type = IdType.ASSIGN_ID) //默认id
 * @author Z
 * 以后用户多了以后，要进行分表操作，id需要用分布式id
 *     @TableId(type = IdType.AUTO) 数据库自增
 */
@Data
public class SysUser {
    private Long id;

    private String account;

    private String admin;

    private String avatar;

    private Long createDate;

    private Integer deleted;

    private String email;

    private Long lastLogin;

    private String mobilePhoneNumber;

    private String nickname;

    private String password;

    private String salt;

    private String status;

}
