package com.zhq.demo.executor;

import com.zhq.demo.entity.Country;
import com.zhq.demo.util.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @program: mybatis-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-10-27 18:01
 **/
public class SimpleExecutor implements Executor {

    @Override
    public <T> T query(String sql, Object parameter) {
        try {
            Connection connection = JdbcUtils.getConnect();
            PreparedStatement pstmt = connection.prepareStatement(String.format(sql, Integer.valueOf(String.valueOf(parameter))));
            ResultSet rs = pstmt.executeQuery();
            Country country = new Country();
            while (rs.next()) {
                country.setId(rs.getInt(1));
                country.setCountryname(rs.getString(2));
                country.setCountrycode(rs.getString(3));
            }
            return (T) country;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
