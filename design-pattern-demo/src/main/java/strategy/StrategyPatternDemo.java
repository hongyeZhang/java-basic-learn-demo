package strategy;

/**
 * @program: design-pattern-demo
 * @description: 策略模式
 * @author: ZHQ
 * @create: 2019-06-30 19:02
 **/
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new AddOperation());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context.setStrategy(new SubstractOperation());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

    }
}
