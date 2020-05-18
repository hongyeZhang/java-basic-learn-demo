package facade;

/**
 * @program: design-pattern-demo
 * @description: 外观模式
 * @author: ZHQ
 * @create: 2019-06-30 12:29
 **/
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
