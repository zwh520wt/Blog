package com.example.springboot.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

import java.util.List;

/**
 * @author Z
 * 评论返回的封装
 */
@Data
public class CommentVo {
    /***
     * @JsonSerialize(using = ToStringSerializer.class) 防止前端 精度损失 把id转为string
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private String id;

    private UserVo author;

    private String content;

    private List<CommentVo> childrens;

    private String createDate;

    private Integer level;

    private UserVo toUser;
}
