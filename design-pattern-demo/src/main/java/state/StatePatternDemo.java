package state;

/**
 * @program: design-pattern-demo
 * @description: 状态模式
 * @author: ZHQ
 * @create: 2019-06-30 18:40
 **/
public class StatePatternDemo {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
