package businessdelegate;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 20:06
 **/
public class BusinessDelegate {
    private BussinessService bussinessService;
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        bussinessService = BussinessLookUp.getBusinessService(serviceType);
        bussinessService.doProcessing();
    }
}
