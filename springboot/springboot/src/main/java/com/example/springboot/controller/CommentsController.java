package com.example.springboot.controller;

import com.example.springboot.service.CommentsService;
import com.example.springboot.vo.Result;
import com.example.springboot.vo.params.CommentParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Z
 * 评论功能
 */
@RestController
@RequestMapping("comments")
public class CommentsController {


    @Autowired
    private CommentsService commentsService;

    @GetMapping("article/{id}")
    public Result comments(@PathVariable("id") Long id) {
        return commentsService.commentsByArticleId(id);
    }

    @PostMapping("create/change")
    public Result comment(@RequestBody CommentParam commentParam){
        return commentsService.comment(commentParam);
    }
}
