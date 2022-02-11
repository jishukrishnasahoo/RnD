package spring.com.springweb;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class HasmapDuplicateKeysEmployee extends Abs
{
    public static void main (String args [])
    {
        HashMap<Employee, String> employeeHashMap = new HashMap<>();
        Employee employee = new Employee(1,1,1000);
        Employee employee1 = new Employee(2,1,1000);

        Map map = new ConcurrentHashMap<>();


        List i = new ArrayList<>();
        i.add(9);
        i.add(1);
        i.add(3);
        i.add(2);


        employeeHashMap.put(employee, "jishu");
        employeeHashMap.put(employee1, "krish");

        String e = employeeHashMap.get(employee1);

        System.out.println("equality "+ employee.equals(employee));

        System.out.println("employeeHashMap "+ employeeHashMap.toString());

        System.out.println("fetched employee "+ employee.hashCode());
        System.out.println("fetched employee "+ employee1.hashCode());
        System.out.println("fetched employee "+ e);
        System.out.println("fetched employee "+ employeeHashMap.size());
        System.out.println("fetched employee "+ employeeHashMap.get(employee));

        Employee employee2 = new Employee(2,1,1000);
        System.out.println("fetched employee "+ employeeHashMap.get(employee));
        System.out.println(i);
    }

}