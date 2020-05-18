package com.zhq.hello.rabbitmq.utils;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @program: hello-rabbitmq
 * @description:
 * @author: ZHQ
 * @create: 2019-10-13 23:36
 **/
public class ConnectionUtils {

    /**
     * 获取连接
     * @return
     */
    public static Connection getConnection() throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("192.168.41.129");
        factory.setPort(5672);
        factory.setVirtualHost("/vhost_zhq");
        factory.setUsername("user_zhq");
        factory.setPassword("123456");
        return factory.newConnection();

    }
}
