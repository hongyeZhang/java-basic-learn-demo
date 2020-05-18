package com.zhq.hello.rabbitmq.topic;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.zhq.hello.rabbitmq.utils.ConnectionUtils;

/**
 * @program: hello-rabbitmq
 * @description:
 * @author: ZHQ
 * @create: 2019-10-28 23:22
 **/
public class Send {
    public static final String EXANCHE_NAME = "test_exchange_topic";

    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtils.getConnection();
        Channel channel = connection.createChannel();

        channel.exchangeDeclare(EXANCHE_NAME, "topic");

        String msg = "商品...";
        channel.basicPublish(EXANCHE_NAME, "good.add", null, msg.getBytes());
        System.out.println("send : " + msg);

        channel.close();
        connection.close();
    }
}
