package com.example.springboot.service;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.example.springboot.dao.mapper.ArticleMapper;
import com.example.springboot.dao.pojo.Article;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author Z
 * 线程池
 */
@Component
public class ThreadService {

    /***
     * 期望此操作在线程池 执行 不会影响原有的主线程
     * 更新文章的浏览次数
     *  updateWrapper.eq(Article::getViewCounts, viewCounts);  相当于乐观锁
     * @param articleMapper
     * @param article
     */
    @Async("taskExecutor")
    public void updateArticleViewCount(ArticleMapper articleMapper, Article article) {

        int viewCounts = article.getViewCounts();
        Article articleUpdate = new Article();
        articleUpdate.setViewCounts(viewCounts + 1);
        LambdaUpdateWrapper<Article> updateWrapper = new LambdaUpdateWrapper<>();
        updateWrapper.eq(Article::getId, article.getId());
        //设置一个 为了在多线程的环境下 线程安全
        updateWrapper.eq(Article::getViewCounts, viewCounts);
        // update article set view_count=100 where view_count == 99 and id = 11
        // UPDATE ms_article SET view_counts=? WHERE (id = ? AND view_counts = ?)
        articleMapper.update(articleUpdate, updateWrapper);
        try {
            Thread.sleep(5000);
            System.out.println("更新完成了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
