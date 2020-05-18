package template;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 19:33
 **/
public class Football extends Game {
    @Override
    public void initialize() {
        System.out.println("football initialize");
    }

    @Override
    public void start() {
        System.out.println("football start");
    }

    @Override
    public void end() {
        System.out.println("football end");
    }
}
