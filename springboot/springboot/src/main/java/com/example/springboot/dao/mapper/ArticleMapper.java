package com.example.springboot.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springboot.dao.dos.Archives;
import com.example.springboot.dao.pojo.Article;

import java.util.List;

/***
 * @author z
 * 文章列表接口
 */
public interface ArticleMapper extends BaseMapper<Article> {


    /***
     * 文章归档
     * @return
     */
    List<Archives> listArchives();


    /***
     * 所有文章归档
     * @param page
     * @param categoryId
     * @param tagId
     * @param year
     * @param month
     * @return
     */
    IPage<Article> listArticle(Page<Article> page,
                               Long categoryId,
                               Long tagId,
                               String year,
                               String month);
}
