package interceptingfilter;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 20:38
 **/
public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("authenticating request : " + request);
    }
}
