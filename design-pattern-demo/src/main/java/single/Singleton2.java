package single;

/**
 * @program: design-pattern-demo
 * @description:  lazy init, 线程安全
 * @author: ZHQ
 * @create: 2019-06-29 19:52
 **/
public class Singleton2 {
    public static Singleton2 instance;
    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance =  new Singleton2();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("singleton pattern 2 message");
    }

}
