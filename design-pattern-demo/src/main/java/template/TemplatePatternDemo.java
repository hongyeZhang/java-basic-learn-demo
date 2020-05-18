package template;

/**
 * @program: design-pattern-demo
 * @description: 模板模式
 * @author: ZHQ
 * @create: 2019-06-30 19:34
 **/
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();

        Game game2 = new Football();
        game2.play();
    }
}
