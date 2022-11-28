package com.example.springboot.dao.pojo;

import lombok.Data;

/***
 * @author Z
 * 文章详细信息
 */
@Data
public class ArticleBody {
    private Long id;

    private String content;

    private String contentHtml;

    private Long articleId;
}
