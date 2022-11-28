package com.example.springboot.vo;


/***
 * @author Z
 * 分类 vo
 */

import lombok.Data;

@Data
public class CategoryVo {

    private String id;

    private String avatar;

    private String categoryName;

    private String description;
}
