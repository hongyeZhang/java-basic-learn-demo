package facade;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 12:24
 **/
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("shape : square");
    }
}
