package builder;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-29 21:10
 **/
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "vegburger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
