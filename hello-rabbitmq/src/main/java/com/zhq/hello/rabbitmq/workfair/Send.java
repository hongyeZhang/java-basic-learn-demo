package com.zhq.hello.rabbitmq.workfair;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.zhq.hello.rabbitmq.utils.ConnectionUtils;

/**
 * @program: hello-rabbitmq
 * @description:
 * @author: ZHQ
 * @create: 2019-10-14 23:02
 **/
public class Send {

    private static final String QUEUE_NAME = "test_work_queue";

    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtils.getConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        // 每次仅发送给消费者一条消息，待消费者处理完毕之后再发送下一条
        channel.basicQos(1);

        for (int i = 0; i < 50; ++i) {
            String msg = "hello : " + i;
            System.out.println("[work queue] send : " + msg);
            channel.basicPublish("", QUEUE_NAME, null, msg.getBytes());
            Thread.sleep(5 * i);
        }

        channel.close();
        connection.close();
    }
}
