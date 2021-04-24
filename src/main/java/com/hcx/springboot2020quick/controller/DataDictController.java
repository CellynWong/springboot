package com.hcx.springboot2020quick.controller;

import com.hcx.springboot2020quick.domain.DataDict;
import com.hcx.springboot2020quick.service.DataDictService;
import org.springframework.beans.factory.annotation.Autowired;
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

    /**
     * 演示数据源切换之调用主数据源
     * @param code
     * @return
     */
    @RequestMapping("/master")
    @ResponseBody
    public DataDict findByCode(String code){
        DataDict dataDict = dataDictService.findByCode(code);
        return dataDict;
    }

    /**
     * 演示数据源切换之调用从数据源
     * @param code
     * @return
     */
    @RequestMapping("/slave")
    @ResponseBody
    public DataDict slave(String code){
        DataDict dataDict = dataDictService.findAll();
        return dataDict;
    }
}
