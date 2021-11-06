package spring.com.springweb;

import org.assertj.core.util.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortEmployeeDemo
{
    public static void main (String [] ar)
    {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1,100));
        employees.add(new Employee(2,800));
        employees.add(new Employee(3,300));
        employees.add(new Employee(4,400));
        employees.add(new Employee(5,900));

        List<Employee> sorted = employees.stream().sorted((obj1, obj2) -> (int) (obj2.getId() - obj1.getId())).collect(Collectors.toList());

        Optional<Employee> greaterList = employees.stream().filter(employee -> employee.getId()>1).findAny();

        System.out.println("emplist " + employees);
        System.out.println("emplist " + greaterList);
    }
}