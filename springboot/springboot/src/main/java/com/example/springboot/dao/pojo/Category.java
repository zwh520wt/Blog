package com.example.springboot.dao.pojo;


import lombok.Data;

/**
 * @author Z
 * 文章详细信息的标签
 */
@Data
public class Category {
    private Long id;

    private String avatar;

    private String categoryName;

    private String description;
}
