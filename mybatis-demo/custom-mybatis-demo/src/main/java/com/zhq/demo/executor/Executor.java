package com.zhq.demo.executor;

/**
 * @author ZHQ
 */
public interface Executor {
    <T> T query(String sql, Object parameter);
}
