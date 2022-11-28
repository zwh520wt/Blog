package com.example.springboot.common.aop;

import com.alibaba.fastjson.JSON;
import com.example.springboot.utils.HttpContextUtils;
import com.example.springboot.utils.IpUtils;
import com.sun.net.httpserver.HttpContext;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.One;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * @author Z
 * AOP日志 实现类
 */
@Component
@Aspect
@Slf4j
public class LogAspect {
    @Pointcut("@annotation(com.example.springboot.common.aop.LogAnnotation)")
    public void pt() {
    }

    /***
     * 环绕通知
     * @param joinPoint
     * @return
     */
    @Around("pt()")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        long beginTime = System.currentTimeMillis();
        //执行方法
        Object result = joinPoint.proceed();
        //执行时长（毫秒）
        Long time = System.currentTimeMillis() - beginTime;
        //保存日志
        recordLog(joinPoint, time);
        return result;
    }

    private void recordLog(ProceedingJoinPoint joinPoint, Long time) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        LogAnnotation logAnnotation = method.getAnnotation(LogAnnotation.class);
        log.info("====================== log start ========================");
        log.info("module:{}", logAnnotation.module());
        log.info("operator:{}", logAnnotation.operator());
        //请求的方法名
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = signature.getName();
        log.info("request method:{}", className + "." + methodName + "()");
        //请求的参数
        Object[] args = joinPoint.getArgs();
        String params = JSON.toJSONString(args[0]);
        log.info("params:{}",params);
        //获取request 设置IP地址
        HttpServletRequest request = HttpContextUtils.getHttpServletRequest();
        log.info("ip:{}", IpUtils.getIpAddr(request));

        log.info("excute time :{} ms" ,time);
        log.info("======================== log end ================");
    }
}
