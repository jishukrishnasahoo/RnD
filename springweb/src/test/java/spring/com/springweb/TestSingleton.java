package spring.com.springweb;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class TestSingleton {
    public static void main (String [] arg) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        SingletonClass si = SingletonClass.getInstance();
        System.out.println("hashcode of original " + si.hashCode());
        System.out.println("hascode after cloning " + si.clone().hashCode());

        ObjectOutput out
                = new ObjectOutputStream(new FileOutputStream("file.text"));
        out.writeObject(si);
        out.close();

        // deserialize from file to object
        ObjectInput in
                = new ObjectInputStream(new FileInputStream("file.text"));
        SingletonClass instance2 = (SingletonClass) in.readObject();
        in.close();

        System.out.println("instance1 hashCode:- "
                + si.hashCode());
        System.out.println("instance2 hashCode:- "
                + instance2.hashCode());


        Constructor[] constructors =
                SingletonClass.class.getDeclaredConstructors();
        Constructor c = constructors[0];
        c.setAccessible(true);
        try {
            SingletonClass sc = (SingletonClass)c.newInstance();
        } catch (InstantiationException e) {

        } catch (IllegalAccessException e) {

        } catch (InvocationTargetException e) {

        }
    }
}