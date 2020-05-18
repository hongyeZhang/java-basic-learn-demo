package composite;

/**
 * @program: design-pattern-demo
 * @description: 组合模式
 * @author: ZHQ
 * @create: 2019-06-30 11:10
 **/
public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee CEO = new Employee("john", "CEO", 30000);

        Employee saleHead = new Employee("robert", "sale head", 20000);
        Employee marketingHead = new Employee("michel", "marketing head", 20000);

        Employee clerk1 = new Employee("laura", "marketing", 10000);
        Employee clerk2 = new Employee("bob", "marketing", 10000);
        Employee sale1 = new Employee("richard", "sale", 10000);
        Employee sale2 = new Employee("rob", "sale", 10000);

        CEO.add(saleHead);
        CEO.add(marketingHead);

        saleHead.add(sale1);
        saleHead.add(sale2);
        marketingHead.add(clerk1);
        marketingHead.add(clerk2);

        System.out.println(CEO);
        for (Employee headEmployee : CEO.getSubordinateList()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinateList()) {
                System.out.println(employee);
            }
        }



    }
}
