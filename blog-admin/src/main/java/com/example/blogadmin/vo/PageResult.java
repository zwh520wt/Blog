package com.example.blogadmin.vo;

import lombok.Data;

import java.util.List;

/**
 * 对分页进行包装
 *
 * @author Z
 */
@Data
public class PageResult<T> {

    private List<T> list;

    private Long total;
}