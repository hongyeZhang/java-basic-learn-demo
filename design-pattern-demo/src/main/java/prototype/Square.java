package prototype;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-29 22:01
 **/
public class Square extends Shape {

    public Square() {
        this.setType("square");
    }

    @Override
    void draw() {
        System.out.println("square draw method");
    }
}
