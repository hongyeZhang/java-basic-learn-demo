import com.rabbitmq.client.ConnectionFactory;

/**
 * @program: rabbitmq-java
 * @description:
 * @author: ZHQ
 * @create: 2019-07-17 12:46
 **/
public class RabbitProducer {
    private static final String EXCHANGE_NAME = "exchange_demo";
    private static final String ROUTING_KEY = "routingkey_demo";
    private static final String QUEUE_NAME = "queue_demo";
    private static final String IP_ADRESS = "192.168.41.128";
    private static final int PORT = 5672;


    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost(IP_ADRESS);


    }





}
