package template;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 19:31
 **/
public abstract class Game {
    public abstract void initialize();
    public abstract void start();
    public abstract void end();

    public final void play() {
        initialize();
        start();
        end();
    }
}
