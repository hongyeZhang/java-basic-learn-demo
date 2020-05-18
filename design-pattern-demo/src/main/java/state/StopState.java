package state;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 18:39
 **/
public class StopState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "stop state";
    }
}
