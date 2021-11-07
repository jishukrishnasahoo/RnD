package spring.com.springweb;

import java.util.HashMap;

public class HashmapDuplicateKeysSingleton {

    public static void main(String args[]) {
        HashMap<SingletonClass, String> employeeHashMap = new HashMap<>();
        SingletonClass s1 = SingletonClass.getSingletonClass();
        SingletonClass s2 = SingletonClass.getSingletonClass();

        employeeHashMap.put(s1, "jishu");
        employeeHashMap.put(s2, "krishna");

        String e = employeeHashMap.get(s1);

        System.out.println("equality " + s1.equals(s2));

        System.out.println("employeeHashMap " + employeeHashMap.toString());

        System.out.println("fetched employee " + s1.hashCode());
        System.out.println("fetched employee " + s2.hashCode());
        System.out.println("employee2" + e);
    }

}