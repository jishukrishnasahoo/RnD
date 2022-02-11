package spring.com.springweb;

import com.sun.el.stream.*;
import org.assertj.core.util.Streams;

import java.util.*;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortEmployeeDemo
{
    public static void main (String [] ar)
    {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1,100,999));
        employees.add(new Employee(2,800,888));
        employees.add(new Employee(3,300,888));
        employees.add(new Employee(4,400,999));
        employees.add(new Employee(5,900,888));

        List<Employee> sorted = employees.stream().sorted((obj1, obj2) -> (int) (obj2.getId() - obj1.getId())).collect(Collectors.toList());

        Optional<Employee> greaterList = employees.stream().filter(employee -> employee.getId()>1).findAny();
        Map salaryMap = employees.stream().sorted((e1,e2)-> e1.getSalary().compareTo((Integer) e1.getSalary())).collect(Collectors.groupingBy(employee -> employee.getSalary()));

        List<Integer> numbers = Arrays.asList(1,2,3,5,4,6,7,8,9,10);
        List numbersList = numbers.stream().filter(i -> i%2 ==0).collect(Collectors.toList());


        System.out.println("evenList " + numbers.stream().reduce((i1,i2)-> (i1+i2)).get().intValue()/10);
        numbers.stream().reduce(1, Integer::sum);

        System.out.println( numbers.stream().reduce(0, Integer::sum));
        System.out.println("emplist " + salaryMap);

        Employee e1 = new Employee(1,100,999);
        Employee e2 = new Employee(2,800,800);
        Employee e3 = e1;

        e3.setSalary(500);

        System.out.println("hashcode of e1 "+ e1.getSalary());
        System.out.println("hashcode of e3 "+ e3.hashCode());

        List<Optional<Employee>> listOfOptionals = Arrays.asList(
                Optional.empty(), Optional.of(e1), Optional.empty(), Optional.of(e2));

        List result = listOfOptionals.stream().filter(e -> e.isPresent()).filter(j -> j.get().getSalary()> 100).collect(Collectors.toList());

        System.out.println("result"+ result);

        try {
            new Employee().notifyAll();
        } catch (Exception e) {

        }
    }
}