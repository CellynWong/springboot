package com.hcx.springboot2020quick.service;

import com.hcx.springboot2020quick.domain.DataDict;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Description: spring-boot-2020-quick
 * <p>
 * Created by lenovo-pc on 2021/4/24 15:37
 *
 * @see
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataDictServiceTest {

    @Autowired
    private DataDictService dataDictService;


    @Test
    public void findByCode(){
        DataDict dataDict = dataDictService.findByCode("1");
        System.out.println(dataDict.getCode());
    }

}