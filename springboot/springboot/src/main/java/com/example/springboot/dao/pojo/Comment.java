package com.example.springboot.dao.pojo;

import lombok.Data;

/**
 * @author Z
 * 文章详情评论功能
 */
@Data
public class Comment {
    private Long id;

    private String content;

    private Long createDate;

    private Long articleId;

    private Long authorId;

    private Long parentId;

    private Long toUid;

    private Integer level;
}
