package iterator;

/**
 * @program: design-pattern-demo
 * @description: 迭代器模式
 * @author: ZHQ
 * @create: 2019-06-30 16:54
 **/
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        for (Iterator iterator = nameRepository.getIteraor(); iterator.hasNext(); ) {
            String name = (String) iterator.next();
            System.out.println("name : " + name);
        }

    }
}
