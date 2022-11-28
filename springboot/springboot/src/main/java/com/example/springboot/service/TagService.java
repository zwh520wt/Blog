package com.example.springboot.service;


import com.example.springboot.vo.Result;
import com.example.springboot.vo.TagVo;

import java.util.List;

/***
 * @author Z
 * Tag 标签接口
 */
public interface TagService {

    /***
     * 根据文章id查询相应的标签
     * @param articleId
     * @return
     */
    List<TagVo> findTagsByArticleId(Long articleId);

    /***
     * 查询热门标签
     * @param limit
     * @return
     */
    Result hots(int limit);

    /***
     * 查找所有标签
     * @return
     */
    Result findAll();

    /***
     * 查找文章所有标签
     * @return
     */
    Result findAllDetail();

    /***
     * 根据标签查找对应的所有文章
     * @param id
     * @return
     */
    Result tagsDetailById(Long id);
}
