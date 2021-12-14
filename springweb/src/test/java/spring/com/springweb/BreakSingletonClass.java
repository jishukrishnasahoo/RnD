package spring.com.springweb;


import java.lang.reflect.Constructor;

public class BreakSingletonClass {
    public static void main(String[] args)  {

        SingletonClass objOne = SingletonClass.getInstance();
        SingletonClass objTwo = null;
        try {
            Constructor constructor = SingletonClass.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            objTwo = (SingletonClass) constructor.newInstance();
        } catch (Exception ex) {
            System.out.println(ex);
        }

        System.out.println("Hashcode of Object 1 - "+objOne.hashCode());
        System.out.println("Hashcode of Object 2 - "+objTwo.hashCode());

    }
}