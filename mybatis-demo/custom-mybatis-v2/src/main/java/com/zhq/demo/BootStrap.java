package com.zhq.demo;

import com.zhq.demo.entity.Country;
import com.zhq.demo.mapper.CountryMapper;
import com.zhq.demo.session.MySQLSession;


/**
 * @author ZHQ
 */
public class BootStrap {

    public static void main(String[] args) {
        MySQLSession sqlSession = new MySQLSession();
        CountryMapper mapper = sqlSession.getMapper(CountryMapper.class);
        Country country = mapper.selectByPrimaryKey(1);
        System.out.println(country);
    }
}
