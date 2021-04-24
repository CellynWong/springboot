package com.hcx.springboot2020quick.controller;

import com.hcx.springboot2020quick.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 */
@RestController
public class HelloController {

    @Autowired
    private CommonService commonService;

    @RequestMapping("/hello")
    public String hello(){
        for (int i = 0; i <100 ; i++) {
            System.out.println(i);

        }
        System.out.println("hello world");
        Object obj = new Object();
        //ctrl+alt+v  自动补全返回值
        StringBuffer stringBuffer = new StringBuffer();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();

        return "hello world";
    }

    @RequestMapping("/getProccesor/{type}")
    public List getProcessor(@PathVariable  String type){
        List typeList = commonService.getProcessor(type);
        System.out.println(typeList);
        return typeList;

    }

}



