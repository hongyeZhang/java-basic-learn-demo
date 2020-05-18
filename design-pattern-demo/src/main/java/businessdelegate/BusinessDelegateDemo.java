package businessdelegate;

/**
 * @program: design-pattern-demo
 * @description: 业务代表模式
 * @author: ZHQ
 * @create: 2019-06-30 20:09
 **/
public class BusinessDelegateDemo {
    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");
        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();

    }
}
