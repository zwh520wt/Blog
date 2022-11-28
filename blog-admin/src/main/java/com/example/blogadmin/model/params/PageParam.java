package com.example.blogadmin.model.params;


import lombok.Data;

/***
 * @author Z
 *  插叙时，发起请求的参数
 */
@Data
public class PageParam {

    private Integer currentPage;

    private Integer pageSize;

    private String queryString;
}

