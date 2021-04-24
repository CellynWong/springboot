package com.hcx.springboot2020quick.service.impl;

import com.hcx.springboot2020quick.proccesor.CostTypeProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.Callable;

/**
 * Description: spring-boot-2020-quick
 * <p>
 * Created by lenovo-pc on 2020/10/18 21:13
 *
 * @see
 */
@Component
public class QueryCostTypeList implements Callable {

    @Autowired
    private CostTypeProcessor proccesor;

    public QueryCostTypeList(CostTypeProcessor proccesor) {
        this.proccesor = proccesor;
    }

    @Override
    public Object call() throws Exception {
        return proccesor.getHelloWorld();
    }
}
