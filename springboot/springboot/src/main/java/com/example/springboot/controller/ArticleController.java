package com.example.springboot.controller;

import com.example.springboot.common.aop.LogAnnotation;
import com.example.springboot.common.cache.Cache;
import com.example.springboot.service.ArticleService;
import com.example.springboot.vo.Result;
import com.example.springboot.vo.params.ArticleParam;
import com.example.springboot.vo.params.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/***
 * JSON数据进行交互
 * @author 张伟豪
 */
@RestController
@RequestMapping("articles")
public class ArticleController {

    @PostMapping("search")
    public Result search(@RequestBody ArticleParam articleParam){
        //写一个搜索接口
        String search = articleParam.getSearch();
        return articleService.searchArticle(search);
    }

    @Autowired
    private ArticleService articleService;

    /***
     * 首页文章列表
     * @LogAnnotation(module="文章",operator="获取文章列表") 加上此注解 代表要对此接口记录日志
     * @param pageParams
     * @return
     */
    @PostMapping
    @LogAnnotation(module = "文章", operator = "获取文章列表")
    @Cache(expire = 5 * 60 * 1000, name = "listArticle")
    public Result listArticle(@RequestBody PageParams pageParams) {
        return articleService.listArticle(pageParams);
    }


    /***
     * 热门文章推荐
     * @return
     */

    @PostMapping("hot")
    @Cache(expire = 5 * 60 * 1000, name = "hot_article")
    public Result hotArticle() {
        int limit = 5;
        return articleService.hotArticle(limit);
    }

    /***
     * 最新文章推荐
     * @return
     */
    @PostMapping("new")
    @Cache(expire = 5 * 60 * 1000, name = "news_article")
    public Result newArticles() {
        int limit = 5;
        return articleService.newArticles(limit);
    }

    /***
     * 文章归档
     * @return
     */
    @PostMapping("listArchives")
    public Result listArchives() {
        return articleService.listArchives();
    }

    /***
     * 文章详细信息
     * @param articleId
     * @return
     */
    @PostMapping("view/{id}")
    public Result findArticleById(@PathVariable("id") Long articleId) {
        return articleService.findArticleById(articleId);
    }

    /***
     * 文件上传
     * @return
     */
    @PostMapping("publish")
    public Result publish(@RequestBody ArticleParam articleParam) {
        return articleService.publish(articleParam);
    }
}
