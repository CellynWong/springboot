package com.hcx.springboot2020quick.controller;

import com.hcx.springboot2020quick.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 */
@RestController
public class HelloController {

    @Autowired
    private CommonService commonService;

    @RequestMapping("/getProccesor/{type}")
    public List getProcessor(@PathVariable  String type){
        List typeList = commonService.getProcessor(type);
        return typeList;

    }

}



