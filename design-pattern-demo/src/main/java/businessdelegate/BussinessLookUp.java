package businessdelegate;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 20:03
 **/
public class BussinessLookUp {
    private static final String EJB = "EJB";
    private static final String JMS = "JMS";

    public static BussinessService getBusinessService(String serviceType) {
        if (EJB.equalsIgnoreCase(serviceType)) {
            return new EJBService();
        } else if (JMS.equalsIgnoreCase(serviceType)) {
            return new JMSService();
        }
        return null;
    }
}
