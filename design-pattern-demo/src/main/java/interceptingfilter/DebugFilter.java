package interceptingfilter;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 20:39
 **/
public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("log request : " + request);
    }
}
