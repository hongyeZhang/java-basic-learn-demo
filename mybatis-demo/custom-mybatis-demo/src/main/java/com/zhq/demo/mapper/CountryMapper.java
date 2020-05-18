package com.zhq.demo.mapper;

import com.zhq.demo.entity.Country;

/**
 * @program: mybatis-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-10-27 17:48
 **/
public interface CountryMapper {
    Country selectByPrimaryKey(Integer id);
}
