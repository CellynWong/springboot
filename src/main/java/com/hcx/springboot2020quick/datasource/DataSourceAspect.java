package com.hcx.springboot2020quick.datasource;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Description: spring-boot-2020-quick
 * <p>
 * Created by lenovo-pc on 2021/4/24 21:39
 * 切面  以注解为触发点
 * @see
 */
@Component
@Aspect
public class DataSourceAspect {

    @Pointcut("@annotation(com.hcx.springboot2020quick.datasource.MyDataSource)")
    public void dataSourcePointCut(){

    }

    @Around("dataSourcePointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        MethodSignature methodSignature = (MethodSignature)point.getSignature();
        Method method = methodSignature.getMethod();
        MyDataSource dataSource = method.getAnnotation(MyDataSource.class);
        if(dataSource == null){
            DynamicDataSource.setDataSource("master-db");
        }else{
            DynamicDataSource.setDataSource(dataSource.name());
        }
        try {
            return point.proceed();
        }finally {
            DynamicDataSource.clearDataSource();
        }
    }
}
