package criteria;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 10:13
 **/
public class CriteriaFemale implements Criteria {
    private static final String FEMALE = "female";

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        return personList.stream().filter(person -> (FEMALE.equalsIgnoreCase(person.getGender()))).collect(Collectors.toList());
    }
}
