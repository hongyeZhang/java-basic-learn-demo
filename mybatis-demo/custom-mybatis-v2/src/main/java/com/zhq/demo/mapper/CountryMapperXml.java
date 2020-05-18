package com.zhq.demo.mapper;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: mybatis-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-10-27 17:52
 **/
public class CountryMapperXml {
    public static final String NAME_SPACE = "com.zhq.demo.mapper.CountryMapper";

    public static final Map<String, String> MRTHOD_SQL_MAP = new HashMap<>(16);

    static {
        MRTHOD_SQL_MAP.put("selectByPrimaryKey", "select * from country where id = %d");
    }

}
