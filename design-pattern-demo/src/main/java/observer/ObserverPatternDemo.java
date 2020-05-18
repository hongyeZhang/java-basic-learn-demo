package observer;

/**
 * @program: design-pattern-demo
 * @description: 观察者模式
 * @author: ZHQ
 * @create: 2019-06-30 18:17
 **/
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new HexaObserver(subject);
        new OctalObserver(subject);

        subject.setState(10);
    }
}
