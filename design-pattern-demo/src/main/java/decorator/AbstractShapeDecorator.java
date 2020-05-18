package decorator;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 11:58
 **/
public abstract class AbstractShapeDecorator implements Shape {
    protected Shape decoratoredShape;

    public AbstractShapeDecorator(Shape decoratoredShape) {
        this.decoratoredShape = decoratoredShape;
    }

    @Override
    public void draw() {
        decoratoredShape.draw();
    }
}
