package bridge;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 09:30
 **/
public class RedCircle implements DrawAPI {
    public void drawCircle(int radius, int x, int y) {
        System.out.println("drawing [red] circle radius :" + radius + " x : " + x + "y : " + y);
    }
}
