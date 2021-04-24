package com.hcx.springboot2020quick;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan(basePackages = "com.hcx.springboot2020quick.mapper")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})  //不加载默认数据源
public class SpringBoot2020QuickApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot2020QuickApplication.class, args);
    }

}
