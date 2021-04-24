package com.hcx.springboot2020quick.dao.impl;

import com.hcx.springboot2020quick.dao.DataDictDao;
import com.hcx.springboot2020quick.domain.DataDict;
import org.springframework.stereotype.Repository;

/**
 * Description: spring-boot-2020-quick
 * <p>
 * Created by lenovo-pc on 2021/4/10 11:25
 *
 * @see
 */
@Repository
public class DataDictDaoImpl implements DataDictDao {

    @Override
    public DataDict findByCode(String code) {
        return null;
    }
}
