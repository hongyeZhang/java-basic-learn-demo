package decorator;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 12:01
 **/
public class RedShapeDecorator extends AbstractShapeDecorator {

    public RedShapeDecorator(Shape decoratoredShape) {
        super(decoratoredShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(decoratoredShape);

    }

    public void setRedBorder(Shape decoratoredShape) {
        System.out.println("border color : red");
    }

}
