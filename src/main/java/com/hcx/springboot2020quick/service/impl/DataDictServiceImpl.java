package com.hcx.springboot2020quick.service.impl;

import com.hcx.springboot2020quick.datasource.MyDataSource;
import com.hcx.springboot2020quick.domain.DataDict;
import com.hcx.springboot2020quick.mapper.DataDictMapper;
import com.hcx.springboot2020quick.service.DataDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description: spring-boot-2020-quick
 * <p>
 * Created by lenovo-pc on 2021/4/10 11:23
 *
 * @see
 */
@Service
public class DataDictServiceImpl implements DataDictService {

    @Autowired
    private DataDictMapper dataDictMapper;

    @MyDataSource(name = "master-db")
    @Override
    public DataDict findByCode(String code) {
        return dataDictMapper.findByCode(code);
    }

    @MyDataSource(name = "slave-db")
    @Override
    public DataDict findAll() {
        return dataDictMapper.findAll();
    }


}
