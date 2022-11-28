package com.example.springboot.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

/***
 * @author Z
 * 显示在页面上的标签,和页面交互的数据
 */
@Data
public class TagVo {

    private String id;

    private String tagName;
}
