package com.example.springboot.dao.dos;

import lombok.Data;

/***
 * @author Z
 * 文章归档 ，与数据库操作，但是不需要持久化的对象放入dos中
 */
@Data
public class Archives {
    private Integer year;

    private Integer month;

    private Long count;
}
