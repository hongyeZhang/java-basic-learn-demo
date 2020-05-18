package state;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 18:38
 **/
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "start state";
    }
}
