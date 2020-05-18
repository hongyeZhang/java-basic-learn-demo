package bridge;

/**
 * @program: design-pattern-demo
 * @description: 桥接模式
 * @author: ZHQ
 * @create: 2019-06-30 09:41
 **/
public class BridgePatternDemo {
    public static void main(String[] args) {
        AbstractShape redCircle = new Cirle(new RedCircle(), 10, 100, 100);
        redCircle.draw();

        AbstractShape greenCircle = new Cirle(new GreenCircle(), 5, 50, 50);
        greenCircle.draw();

    }
}
