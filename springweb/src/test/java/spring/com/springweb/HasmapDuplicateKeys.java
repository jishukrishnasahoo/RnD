package spring.com.springweb;

import java.util.HashMap;

public class HasmapDuplicateKeys
{
    public static void main (String args [])
    {
        HashMap<Employee, String> employeeHashMap = new HashMap<>();
        Employee employee = new Employee(5, 1,500);
        Employee employee1 = new Employee(5, 1, 500);
        Employee employee2 = new Employee(5, 1,500);

        employeeHashMap.put(employee, "jishu");
        employeeHashMap.put(employee1, "krishna");
        employee2 = employee1;
        employeeHashMap.put(employee2, "sahoo");
        employeeHashMap.put(employee, "krish");

        String e = employeeHashMap.get(employee);

        System.out.println("equality "+ employee.equals(employee));

        System.out.println("employeeHashMap "+ employeeHashMap.toString());


        System.out.println("fetched employee "+ employee.hashCode());
        System.out.println("fetched employee "+ employee1.hashCode());
        System.out.println("employee2"+ e);
    }
}