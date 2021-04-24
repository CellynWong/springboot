package com.hcx.springboot2020quick.proccesor;

import org.springframework.stereotype.Component;

/**
 * Description: spring-boot-2020-quick
 * <p>
 * Created by lenovo-pc on 2020/10/18 13:12
 *
 * @see
 */
@Component
public class CostTypeProcessor implements AbstractProccesor {


    @Override
    public String getHelloWorld() {
        return "CostTypeProcessor";
    }
}
