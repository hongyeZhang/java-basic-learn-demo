package com.zhq.demo;

import com.zhq.demo.entity.Country;
import com.zhq.demo.mapper.CountryMapper;
import com.zhq.demo.session.MySQLSession;

/**
 * @program: mybatis-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-10-27 18:07
 **/
public class BootStrap {

    public static void main(String[] args) {
        MySQLSession sqlSession = new MySQLSession();
        CountryMapper mapper = sqlSession.getMapper(CountryMapper.class);
        Country country = mapper.selectByPrimaryKey(1);
        System.out.println(country);
    }
}
