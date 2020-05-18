package abstractfactory;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-29 19:14
 **/
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("blue fill method");
    }
}
