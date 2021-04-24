package com.hcx.springboot2020quick.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import javax.sql.DataSource;
import java.util.Map;

/**
 * Description: spring-boot-2020-quick
 * <p>
 * Created by lenovo-pc on 2021/4/24 18:07
 * 设置动态数据源
 * @see
 */

public class DynamicDataSource extends AbstractRoutingDataSource {

    //通过ThreadLocal维护一个全局唯一的map来实现数据源的动态切换
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

    //指定使用哪个数据源
    @Override
    protected Object determineCurrentLookupKey() {
        return getDataSource();
    }

    public DynamicDataSource(DataSource defaultTargetDataSource, Map<Object,Object> targetDataSource) {
        super.setDefaultTargetDataSource(defaultTargetDataSource);
        super.setTargetDataSources(targetDataSource);
        super.afterPropertiesSet();
    }

    //获取数据源
    public static String getDataSource(){
        return contextHolder.get();
    }

    //设置数据源
    public static void setDataSource(String dataSource){
        contextHolder.set(dataSource);
    }

    //清空threadLocal中的数据源
    public static void clearDataSource(){
        contextHolder.remove();
    }
}
