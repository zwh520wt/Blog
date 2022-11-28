package com.example.springboot.common.aop;

import java.lang.annotation.*;

/**
 * @author Z
 * AOP记录日志
 * Type 代表可以放在类上面 Method 代表可以放在方法上面
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogAnnotation {

    String module() default "";

    String operator() default "";
}
