package command;

/**
 * @program: design-pattern-demo
 * @description: 命令模式
 * @author: ZHQ
 * @create: 2019-06-30 16:33
 **/
public class CommandPatternDemo {

    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStock = new BuyStock(abcStock);
        SellStock sellStock = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.addOrder(buyStock);
        broker.addOrder(sellStock);
        broker.addOrder(sellStock);

        broker.executeOrder();


    }
}
