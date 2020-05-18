package interceptingfilter;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 20:40
 **/
public class Target {
    public void execute(String request) {
        System.out.println("executing request : " + request);
    }
}
