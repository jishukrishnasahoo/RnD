package spring.com.springweb;

import java.util.HashMap;

public class HasmapDuplicateKeysEmployee
{
    public static void main (String args [])
    {
        HashMap<Employee, String> employeeHashMap = new HashMap<>();
        Employee employee = new Employee(1,1,1000);
        Employee employee1 = new Employee(2,1,1000);


        employeeHashMap.put(employee, "jishu");
        employeeHashMap.put(employee1, "krish");

        String e = employeeHashMap.get(employee1);

        System.out.println("equality "+ employee.equals(employee));

        System.out.println("employeeHashMap "+ employeeHashMap.toString());

        System.out.println("fetched employee "+ employee.hashCode());
        System.out.println("fetched employee "+ employee1.hashCode());
        System.out.println("fetched employee "+ e);
    }

}