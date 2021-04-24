package com.hcx.springboot2020quick.datasource;

import java.lang.annotation.*;

/**
 * Description: spring-boot-2020-quick
 * <p>
 * Created by lenovo-pc on 2021/4/24 21:35
 * 动态指定数据源的注解
 * @see
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyDataSource {
    String name() default "";
}
