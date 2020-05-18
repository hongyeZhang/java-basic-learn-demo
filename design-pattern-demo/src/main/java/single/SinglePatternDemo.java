package single;

/**
 * @program: design-pattern-demo
 * @description: 单例模式
 * @author: ZHQ
 * @create: 2019-06-29 19:50
 **/
public class SinglePatternDemo {
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        singleton1.showMessage();

        Singleton2 singleton2 = Singleton2.getInstance();
        singleton2.showMessage();

        Singleton3 singleton3 = Singleton3.getInstance();
        singleton3.showMessage();

        Singleton4 singleton4 = Singleton4.getInstance();
        singleton4.showMessage();

    }
}
