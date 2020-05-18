package com.zhq.demo.mapper;


import com.zhq.demo.session.MySQLSession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: mybatis-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-10-27 15:57
 **/
public class MapperProxy<T> implements InvocationHandler {
    private final MySQLSession sqlSession;
    private final Class<T> mapperInterface;

    public MapperProxy(MySQLSession mySQLSession, Class<T> type) {
        this.sqlSession = mySQLSession;
        this.mapperInterface =  type;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getDeclaringClass().getName().equals(CountryMapperXml.NAME_SPACE)) {
            String sql = CountryMapperXml.MRTHOD_SQL_MAP.get(method.getName());
            System.out.println(String.format("SQL [%s], parameter [%s]", sql, args[0]));
            return sqlSession.selectOne(sql, String.valueOf(args[0]));
        }
        return null;
    }
}
