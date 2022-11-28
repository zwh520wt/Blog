package com.example.springboot.controller;


import com.example.springboot.service.TagService;
import com.example.springboot.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @author Z
 * 最热标签
 */
@RestController
@RequestMapping("tags")
public class TagsController {

    @Autowired
    private TagService tagService;


    @GetMapping("hot")
    public Result hot() {
        //查询最热的六个标签
        int limit = 6;
        return tagService.hots(limit);
    }

    @GetMapping("")
    public Result findAll() {
        return tagService.findAll();
    }

    @GetMapping("detail")
    public Result tagsDetail() {
        return tagService.findAllDetail();
    }

    @GetMapping("detail/{id}")
    public Result categoryDetailById(@PathVariable("id") Long id){
        return tagService.tagsDetailById(id);
    }
}
