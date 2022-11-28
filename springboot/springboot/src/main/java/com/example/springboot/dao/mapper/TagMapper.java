package com.example.springboot.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot.dao.pojo.Tag;

import java.util.List;

/**
 * @author Z
 * 对标签进行的一系列操作
 */
public interface TagMapper extends BaseMapper<Tag> {

    /***
     * 根据文章id找对应的标签
     * @param articleId
     * @return
     */
    List<Tag> findTagsByArticleId(Long articleId);

    /***
     *查询最热的标签，前 limit 条
     * @param limit
     * @return
     */
    List<Long> findHotsTagIds(int limit);

    /***
     * 根据id查标签
     * @param tagIds
     * @return
     */
    List<Tag> findTagsByTagIds(List<Long> tagIds);


}
