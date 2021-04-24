package com.hcx.springboot2020quick.mapper;

import com.hcx.springboot2020quick.domain.DataDict;
import org.apache.ibatis.annotations.Mapper;

/**
 * Description: spring-boot-2020-quick
 * <p>
 * Created by lenovo-pc on 2021/4/10 11:27
 *
 * @see
 */
@Mapper
public interface DataDictMapper {

    DataDict findByCode(String code);

    DataDict findAll();
}
