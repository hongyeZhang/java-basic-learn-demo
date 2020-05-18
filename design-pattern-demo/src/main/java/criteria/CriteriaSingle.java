package criteria;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 10:15
 **/
public class CriteriaSingle implements Criteria{
    private static final String SINGLE = "single";
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        return personList.stream().filter(person -> (SINGLE.equalsIgnoreCase(person.getMaritalStatus()))).collect(Collectors.toList());
    }
}
