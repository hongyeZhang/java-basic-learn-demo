package com.zhq.hello.rabbitmq.routing;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.zhq.hello.rabbitmq.utils.ConnectionUtils;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @program: hello-rabbitmq
 * @description:
 * @author: ZHQ
 * @create: 2019-10-15 00:14
 **/
public class Send {

    public static final String EXANCHE_NAME = "test_exchange_direct";

    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtils.getConnection();
        Channel channel = connection.createChannel();

        channel.exchangeDeclare(EXANCHE_NAME, "direct");
        String msg = "hello ps";
        String routingKey = "info";
        channel.basicPublish(EXANCHE_NAME, routingKey, null, msg.getBytes());

        System.out.println("send : " + msg);

        channel.close();
        connection.close();


    }
}
