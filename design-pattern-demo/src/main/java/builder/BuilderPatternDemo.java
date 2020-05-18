package builder;

/**
 * @program: design-pattern-demo
 * @description: 建造者模式
 * @author: ZHQ
 * @create: 2019-06-29 21:23
 **/
public class BuilderPatternDemo {

    public static void main(String[] args) {
        Meal vegMeal = MealBuilder.getVegMeal();
        System.out.println("veg meal");
        vegMeal.showItems();
        System.out.println("total cost :" + vegMeal.getPrice());
    }
}
