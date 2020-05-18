package com.zhq.demo;

import java.sql.*;

/**
 * @author : ZHQ
 * @date : 2019/12/14
 */
public class TemplateTest {

    private static final String URL = "jdbc:mysql://192.168.41.129:3306/mybatis";
    private static final String USER = "root";
    private static final String PASS_WORD = "123456";

    // 注册驱动
    static {
        try {
            // 加载驱动
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    static void template() throws Exception {
        // 加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            // 建立连接
            conn = DriverManager.getConnection(URL, USER, PASS_WORD);
            // 创建语句
            st = conn.createStatement();
            // 执行语句
            rs = st.executeQuery("select * from country");
            // 获得结果并输出
            while (rs.next()) {
                Country country = new Country();
                country.setId((int)rs.getObject(1));
                country.setCountrycode((String) rs.getObject(2));
                country.setCountryname((String) rs.getObject(3));
                System.out.println(country);
            }
        } finally {
            // 释放资源
            rs.close();
            conn.close();
            st.close();
        }
    }

    public static void main(String[] args) throws Exception {
        template();
    }

}
