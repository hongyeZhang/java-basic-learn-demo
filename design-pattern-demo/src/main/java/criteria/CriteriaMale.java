package criteria;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 10:07
 **/
public class CriteriaMale implements Criteria {
    private static final String MALE = "male";

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        return personList.stream().filter(person -> (MALE.equalsIgnoreCase(person.getGender()))).collect(Collectors.toList());
    }
}
