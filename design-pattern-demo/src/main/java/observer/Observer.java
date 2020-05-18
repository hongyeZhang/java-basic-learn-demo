package observer;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 18:03
 **/
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
