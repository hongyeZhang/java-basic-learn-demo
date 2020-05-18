package businessdelegate;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 20:01
 **/
public class EJBService implements BussinessService {
    @Override
    public void doProcessing() {
        System.out.println("processing task by EJB service");
    }
}
