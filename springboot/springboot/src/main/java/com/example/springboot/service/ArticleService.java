package com.example.springboot.service;

import com.example.springboot.vo.Result;
import com.example.springboot.vo.params.ArticleParam;
import com.example.springboot.vo.params.PageParams;

/***
 * @author 张伟豪
 * 文章 service层接口
 */
public interface ArticleService {
    /***
     * 分页查询文章列表
     * @param pageParams
     * @return
     */
    Result listArticle(PageParams pageParams);

    /***
     * 最热文章列表
     * @param limit
     * @return
     */
    Result hotArticle(int limit);

    /***
     * 最新文章列表
     * @param limit
     * @return
     */
    Result newArticles(int limit);

    /***
     * 文章归档
     * @return
     */
    Result listArchives();

    /***
     * 根据id查询文章
     * @param articleId
     * @return
     */
    Result findArticleById(Long articleId);

    /***
     * 文件上传
     * @param articleParam
     * @return
     */
    Result publish(ArticleParam articleParam);

    /***
     * 搜索
     * @param search
     * @return
     */
    Result searchArticle(String search);
}
