package single;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-29 20:14
 **/
public class Singleton5 {
    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void showMessage() {
        System.out.println("singleton pattern 5 message");
    }
}
