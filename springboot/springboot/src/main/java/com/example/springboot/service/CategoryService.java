package com.example.springboot.service;

import com.example.springboot.vo.CategoryVo;
import com.example.springboot.vo.Result;

/***
 * 文章详细信息标签 接口
 * @author Z
 */
public interface CategoryService {
    /***
     * 根据id查找标签详细
     * @param categoryId
     * @return
     */
    CategoryVo findCategoryById(Long categoryId);

    /***
     * 查询所有的文章
     * @return
     */
    Result findAll();

    /***
     * 查询所有文章分类
     * @return
     */
    Result findAllDetail();

    /***
     * 根据分类查询所有文章
     * @param id
     * @return
     */
    Result categoryDetailById(Long id);
}
