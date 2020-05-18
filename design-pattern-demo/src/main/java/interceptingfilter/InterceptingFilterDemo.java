package interceptingfilter;

/**
 * @program: design-pattern-demo
 * @description: 拦截过滤器模式
 * @author: ZHQ
 * @create: 2019-06-30 20:45
 **/
public class InterceptingFilterDemo {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("hello");
    }
}
