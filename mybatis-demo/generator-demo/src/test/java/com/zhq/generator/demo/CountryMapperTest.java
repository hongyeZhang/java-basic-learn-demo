package com.zhq.generator.demo;

import com.zhq.generator.dao.CountryMapper;
import com.zhq.generator.entity.Country;
import com.zhq.generator.entity.CountryExample;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Collection;
import java.util.List;

public class CountryMapperTest extends BaseMapperTest{


    @Test
    public void testConfiguration() {
        SqlSession sqlSession = getSqlSession();
        Configuration configuration = sqlSession.getConfiguration();
        Collection<MappedStatement> mappedStatements = configuration.getMappedStatements();

        sqlSession.close();
    }

    @Test
    public void testSelectOne() {
        SqlSession sqlSession = getSqlSession();
        try {
            CountryMapper countryMapper = sqlSession.getMapper(CountryMapper.class);
            Country country = countryMapper.selectByPrimaryKey(1);
            System.out.println(country);
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testExample() {
        // 获取 sqlSession
        SqlSession sqlSession = getSqlSession();
        try {
            // 获取 CountryMapper 接口
            CountryMapper countryMapper = sqlSession.getMapper(CountryMapper.class);
            //创建 Example 对象
            CountryExample example = new CountryExample();
            //设置排序规则
            example.setOrderByClause("id desc, countryname asc");
            //设置是否 distinct 去重
            example.setDistinct(true);
            //创建条件，只能有一个 createCriteria
            CountryExample.Criteria criteria = example.createCriteria();
            //id >= 1
            criteria.andIdGreaterThanOrEqualTo(1);
            //id < 4
            criteria.andIdLessThan(4);
            //countrycode like '%U%'
            criteria.andCountrycodeLike("%U%");
            //or 的情况，可以有多个 or
            CountryExample.Criteria or = example.or();
            //countryname = 中国
            or.andCountrynameEqualTo("中国");
            //执行查询
            List<Country> countryList = countryMapper.selectByExample(example);
            printCountryList(countryList);
        } finally {
            // 不要忘记关闭 sqlSession
            sqlSession.close();
        }
    }

    private void printCountryList(List<Country> countryList) {
        for (Country country : countryList) {
            System.out.printf("%-4d%4s%4s\n", country.getId(), country.getCountryname(), country.getCountrycode());
        }
    }


}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme