package abstractfactory;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-29 18:56
 **/
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("circle draw method");
    }
}
