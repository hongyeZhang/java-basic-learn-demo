package builder;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-29 21:11
 **/
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "chickenBurger";
    }

    @Override
    public float price() {
        return 60.0f;
    }
}
