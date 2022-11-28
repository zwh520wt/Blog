package com.example.springboot.dao.pojo;

import lombok.Data;

/**
 * @author Z
 * 文章标签
 */
@Data
public class ArticleTag {

    private Long id;

    private Long articleId;

    private Long tagId;
}
