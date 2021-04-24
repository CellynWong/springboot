package com.hcx.springboot2020quick.domain;

import lombok.Data;

/**
 * Description: spring-boot-2020-quick
 * <p>
 * Created by lenovo-pc on 2021/4/9 22:59
 *
 * @see
 */
//@Data
public class DataDict {

    private Long id;

    private String code;

    private String value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
