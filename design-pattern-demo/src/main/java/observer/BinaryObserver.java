package observer;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 18:10
 **/
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("binary string : " + Integer.toBinaryString(this.subject.getState()));
    }
}
