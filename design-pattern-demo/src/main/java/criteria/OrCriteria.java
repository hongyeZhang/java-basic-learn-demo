package criteria;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 10:20
 **/
public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> personList1 = criteria.meetCriteria(personList);
        List<Person> personList2 = otherCriteria.meetCriteria(personList);
        Set<Person> personSet = new HashSet<>(personList1);
        personSet.addAll(personList2);
        return new ArrayList<>(personSet);
    }
}
