package criteria;

import java.util.List;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 10:05
 **/
public interface Criteria {
    List<Person> meetCriteria(List<Person> personList);
}
