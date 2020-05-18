package com.zhq.generator.demo;

import com.zhq.generator.dao.CountryMapper;
import com.zhq.generator.entity.Country;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @program: mybatis-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-10-20 11:24
 **/
public class CountryCacheTest extends BaseMapperTest {

    @Test
    public void test1() {
        SqlSession sqlSession = getSqlSession();
        Country country1 = null;

        try {
            CountryMapper countryMapper = sqlSession.getMapper(CountryMapper.class);
            country1 = countryMapper.selectByPrimaryKey(1);
            System.out.println(country1.getCountryname());
            country1.setCountryname("zhq");
            Country country2 = countryMapper.selectByPrimaryKey(1);
            System.out.println(country2.getCountryname());
            System.out.println(country1 == country2);
        } finally {
            sqlSession.close();
        }


    }
}
