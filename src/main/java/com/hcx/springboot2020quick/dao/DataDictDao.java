package com.hcx.springboot2020quick.dao;

import com.hcx.springboot2020quick.domain.DataDict;

/**
 * Description: spring-boot-2020-quick
 * <p>
 * Created by lenovo-pc on 2021/4/10 11:24
 *
 * @see
 */
public interface DataDictDao {

    DataDict findByCode(String code);
}
