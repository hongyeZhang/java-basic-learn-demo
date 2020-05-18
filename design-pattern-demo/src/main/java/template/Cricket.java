package template;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 19:32
 **/
public class Cricket extends Game {

    @Override
    public void initialize() {
        System.out.println("cricket initialize");
    }

    @Override
    public void start() {
        System.out.println("cricket start");
    }

    @Override
    public void end() {
        System.out.println("cricket end");
    }
}
