package single;

/**
 * @program: design-pattern-demo
 * @description: lazy初始化，线程不安全
 * @author: ZHQ
 * @create: 2019-06-29 19:46
 **/
public class Singleton1 {
    private static Singleton1 instance;
    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance =  new Singleton1();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("singleton pattern 1 message");
    }
}
