package interceptingfilter;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 20:42
 **/
public class FilterManager {
    private FilterChain filterChain;
    private Target target;

    public FilterManager(Target target) {
        filterChain = new FilterChain();
        this.target = target;
    }

    public void setFilter(Filter filter) {
        filterChain.addFilter(filter);
    }

    public void executeRequest(String request) {
        filterChain.execute(request);
        target.execute(request);
    }

}
