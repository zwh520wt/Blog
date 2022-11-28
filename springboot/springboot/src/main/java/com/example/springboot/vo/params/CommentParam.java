package com.example.springboot.vo.params;

import lombok.Data;

/**
 * @author Z
 * 发布评论
 */
@Data
public class CommentParam {

    private Long articleId;

    private String content;

    private Long parent;

    private Long toUserId;
}
