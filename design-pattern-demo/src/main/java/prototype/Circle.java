package prototype;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-29 22:01
 **/
public class Circle extends Shape {

    public Circle() {
        this.setType("circle");
    }

    @Override
    void draw() {
        System.out.println("circle draw method");
    }
}
