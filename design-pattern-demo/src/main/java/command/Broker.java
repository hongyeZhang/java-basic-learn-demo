package command;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 16:33
 **/
public class Broker {
    List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public void executeOrder() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }


}
