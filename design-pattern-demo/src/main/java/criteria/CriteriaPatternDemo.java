package criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: design-pattern-demo
 * @description: 过滤器模式
 * @author: ZHQ
 * @create: 2019-06-30 10:28
 **/
public class CriteriaPatternDemo {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("robert", "male", "single"));
        personList.add(new Person("john", "male", "married"));
        personList.add(new Person("laura", "female", "married"));
        personList.add(new Person("diana", "female", "single"));
        personList.add(new Person("mike", "male", "single"));
        personList.add(new Person("bobby", "male", "single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFamle = new OrCriteria(single, female);

        System.out.println("males:");
        printPersonList(male.meetCriteria(personList));

        System.out.println("females:");
        printPersonList(female.meetCriteria(personList));

        System.out.println("single:");
        printPersonList(single.meetCriteria(personList));

        System.out.println("singleMale:");
        printPersonList(singleMale.meetCriteria(personList));

        System.out.println("singleOrFemale:");
        printPersonList(singleOrFamle.meetCriteria(personList));




    }

    public static void printPersonList(List<Person> personList) {
        for (Person person : personList) {
            System.out.println("person : [name : " + person.getName() + ", gender : " + person.getGender() +
                    " marital status : " + person.getMaritalStatus() + "]");
        }
    }
}
