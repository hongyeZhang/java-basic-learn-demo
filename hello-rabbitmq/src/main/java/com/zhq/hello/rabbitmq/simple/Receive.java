package com.zhq.hello.rabbitmq.simple;

import com.rabbitmq.client.*;
import com.zhq.hello.rabbitmq.utils.ConnectionUtils;

import java.io.IOException;

/**
 * @program: hello-rabbitmq
 * @description:
 * @author: ZHQ
 * @create: 2019-10-13 23:59
 **/
public class Receive {

    private static final String QUEUE_NAME = "test_simple_queue";

    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws Exception {
        newConsumer();

    }


    public static void newConsumer() throws Exception {
        Connection connection = ConnectionUtils.getConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        DefaultConsumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                String msg = new String(body, "utf-8");
                System.out.println("receive : " + msg);
            }
        };
        channel.basicConsume(QUEUE_NAME, true, consumer);

    }


    @Deprecated
    public static void oldConsumer() throws Exception {
        Connection connection = ConnectionUtils.getConnection();
        Channel channel = connection.createChannel();
        QueueingConsumer consumer = new QueueingConsumer(channel);
        channel.basicConsume(QUEUE_NAME, true, consumer);
        while (true) {
            QueueingConsumer.Delivery delivery = consumer.nextDelivery();
            String recMsg = new String(delivery.getBody());
            System.out.println(recMsg);
        }
    }


}
