package bridge;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 09:32
 **/
public class GreenCircle implements DrawAPI {
    public void drawCircle(int radius, int x, int y) {
        System.out.println("drawing [green] circle radius :" + radius + " x : " + x + "y : " + y);
    }
}
