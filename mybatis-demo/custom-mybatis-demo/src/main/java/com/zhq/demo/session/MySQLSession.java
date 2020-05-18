package com.zhq.demo.session;

import com.zhq.demo.executor.Executor;
import com.zhq.demo.executor.SimpleExecutor;
import com.zhq.demo.mapper.MapperProxy;

import java.lang.reflect.Proxy;

/**
 * @program: mybatis-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-10-27 15:45
 **/
public class MySQLSession {
    private Executor executor = new SimpleExecutor();

    public <T> T selectOne(String statement, Object parameter) {
        return executor.query(statement, parameter);
    }

    public <T> T getMapper(Class<T> type) {
        return (T) Proxy.newProxyInstance(type.getClassLoader(), new Class[]{type}, new MapperProxy(this, type));
    }




}
