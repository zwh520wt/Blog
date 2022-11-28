package com.example.springboot.service;

import com.example.springboot.vo.Result;
import com.example.springboot.vo.params.CommentParam;

/**
 * @author Z
 * 评论功能 接口
 */
public interface CommentsService {

    /***
     * 根据文章id查询评论
     * @param id
     * @return
     */
    Result commentsByArticleId(Long id);

    /***
     * 发布评论
     * @param commentParam
     * @return
     */
    Result comment(CommentParam commentParam);
}
