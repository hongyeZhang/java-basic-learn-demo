package com.zhq.hello.rabbitmq.routing;

import com.rabbitmq.client.*;
import com.zhq.hello.rabbitmq.utils.ConnectionUtils;

import java.io.IOException;

/**
 * @program: hello-rabbitmq
 * @description:
 * @author: ZHQ
 * @create: 2019-10-15 00:18
 **/
public class Recv1 {

    public static final String EXANCHE_NAME = "test_exchange_direct";
    public static final String QUEUE_NAME = "test_queue_direct_1";

    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtils.getConnection();
        final Channel channel = connection.createChannel();

        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        channel.basicQos(1);
        channel.queueBind(QUEUE_NAME, EXANCHE_NAME, "error");

        DefaultConsumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                String msg = new String(body, "utf-8");
                System.out.println("[1] recv receive : " + msg);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("[1] done");
                    channel.basicAck(envelope.getDeliveryTag(), false);
                }
            }
        };

        channel.basicConsume(QUEUE_NAME, false, consumer);





    }
}
