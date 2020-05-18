package bridge;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 09:33
 **/
public abstract class AbstractShape {
    protected DrawAPI drawAPI;

    public AbstractShape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    /**
     *  draw
     **/
    public abstract void draw();
}
