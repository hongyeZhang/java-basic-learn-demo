package interceptingfilter;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 20:40
 **/
public class FilterChain {
    private List<Filter> filterList = new ArrayList<>();

    public void addFilter(Filter filter) {
        filterList.add(filter);
    }

    public void execute(String request) {
        for (Filter filter : filterList) {
            filter.execute(request);
        }
    }
}
