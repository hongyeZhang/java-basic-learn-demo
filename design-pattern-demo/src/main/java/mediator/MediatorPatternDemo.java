package mediator;

/**
 * @program: design-pattern-demo
 * @description: 中介者模式
 * @author: ZHQ
 * @create: 2019-06-30 17:05
 **/
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("robert");
        User amy = new User("amy");
        robert.sendMessage("hi, amy");
        amy.sendMessage("hi, robert");
    }
}
