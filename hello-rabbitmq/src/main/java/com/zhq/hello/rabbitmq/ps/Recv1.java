package com.zhq.hello.rabbitmq.ps;

import com.rabbitmq.client.*;
import com.zhq.hello.rabbitmq.utils.ConnectionUtils;

import java.io.IOException;


/**
 * @program: hello-rabbitmq
 * @description:
 * @author: ZHQ
 * @create: 2019-10-15 00:02
 **/
public class Recv1 {

    public static final String QUEUE_NAME = "test_queue_fanout_email";
    public static final String EXANCHE_NAME = "test_exchange_fanout";


    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtils.getConnection();
        final Channel channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        channel.queueBind(QUEUE_NAME, EXANCHE_NAME, "");

        channel.basicQos(1);

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
