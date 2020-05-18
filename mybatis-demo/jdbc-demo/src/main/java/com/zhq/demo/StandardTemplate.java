package com.zhq.demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @program: mybatis-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-10-27 16:32
 **/
public class StandardTemplate {

    public static void main(String[] args) throws SQLException {
        template();
    }

    static void template() throws SQLException {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            // 建立连接
            conn = JdbcUtils.getConnect();
            // 创建语句
            st = conn.createStatement();
            // 执行语句
            rs = st.executeQuery("select * from country");
            while (rs.next()) {
                Country country = new Country();
                country.setId((int)rs.getObject(1));
                country.setCountrycode((String) rs.getObject(2));
                country.setCountryname((String) rs.getObject(3));
                System.out.println(country);
            }
        } finally {
            // 释放资源
            JdbcUtils.free(rs, st, conn);
        }
    }
}
