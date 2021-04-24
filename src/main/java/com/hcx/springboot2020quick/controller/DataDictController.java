package com.hcx.springboot2020quick.controller;

import com.hcx.springboot2020quick.domain.DataDict;
import com.hcx.springboot2020quick.service.DataDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: spring-boot-2020-quick
 * <p>
 * Created by lenovo-pc on 2021/4/10 11:29
 *
 * @see
 */
@RestController
public class DataDictController {

    @Autowired
    private DataDictService dataDictService;

    @Value("${spring.datasource.driver-class-name}")
    private String dataSource;

    @RequestMapping("/findByCode")
    @ResponseBody
    public DataDict findByCode(String code){
        DataDict dataDict = dataDictService.findByCode(code);
        return dataDict;
    }

}
