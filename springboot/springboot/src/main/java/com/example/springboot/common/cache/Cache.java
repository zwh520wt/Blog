package com.example.springboot.common.cache;

import java.lang.annotation.*;

/**
 * @author Z
 * 自定义注解 统一缓存优化
 * expire() 过期时间
 * name 缓存标识 key
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Cache {

    long expire() default 1 * 60 * 1000;

    //缓存标识 key
    String name() default "";

}