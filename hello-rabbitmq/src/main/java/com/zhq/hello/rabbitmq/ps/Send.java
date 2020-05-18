package com.zhq.hello.rabbitmq.ps;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ExceptionHandler;
import com.zhq.hello.rabbitmq.utils.ConnectionUtils;

/**
 * @program: hello-rabbitmq
 * @description:
 * @author: ZHQ
 * @create: 2019-10-14 23:53
 **/
public class Send {
    public static final String EXANCHE_NAME = "test_exchange_fanout";

    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtils.getConnection();
        Channel channel = connection.createChannel();

        channel.exchangeDeclare(EXANCHE_NAME, "fanout");
        String msg = "hello ps";
        channel.basicPublish(EXANCHE_NAME, "", null, msg.getBytes());
        System.out.println("send : " + msg);

        channel.close();
        connection.close();

    }
}
