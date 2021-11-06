package spring.com.springweb;

import java.util.Map;

public class TestSingleton {
    public static void main (String [] arg) throws CloneNotSupportedException
    {
        SingletonClass si = SingletonClass.getSingletonClass();
        System.out.println("hashcode of original " + si.hashCode());
        System.out.println("hascode after cloning " + si.clone().hashCode());
    }
}