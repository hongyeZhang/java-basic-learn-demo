package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: design-pattern-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-06-30 11:06
 **/
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinateList;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinateList = new ArrayList<>();
    }

    public void add(Employee employee) {
        subordinateList.add(employee);
    }

    public void remove(Employee employee) {
        subordinateList.remove(employee);
    }

    public List<Employee> getSubordinateList() {
        return subordinateList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
