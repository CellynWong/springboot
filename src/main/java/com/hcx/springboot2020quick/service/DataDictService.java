package com.hcx.springboot2020quick.service;

import com.hcx.springboot2020quick.domain.DataDict;

/**
 * Description: spring-boot-2020-quick
 * <p>
 * Created by lenovo-pc on 2021/4/10 11:23
 *
 * @see
 */
public interface DataDictService {

    DataDict findByCode(String code);

    DataDict findAll();
}
