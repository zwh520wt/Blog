package com.example.springboot.vo;

import lombok.Data;

import java.util.List;

/***
 * @author Z
 * 显示在页面上的 文章列表,和页面交互的数据
 */
@Data
public class ArticleVo {
    private String id;

    private String title;

    private String summary;

    private Integer commentCounts;

    private Integer viewCounts;

    private Integer weight;
    /**
     * 创建时间
     */
    private String createDate;

    private UserVo author;

    private ArticleBodyVo body;

    private List<TagVo> tags;

    private CategoryVo category;

}
