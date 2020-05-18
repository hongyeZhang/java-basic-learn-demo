package businessdelegate;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 20:02
 **/
public class JMSService implements BussinessService {
    @Override
    public void doProcessing() {
        System.out.println("processing task by JMS service");
    }
}
