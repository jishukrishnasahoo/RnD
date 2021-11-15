package spring.com.springweb;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentMethodDemo {
    public static void main(String a[]) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        /*Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer value = it.next();
            System.out.println("List Value:" + value);
            if (value.equals(3))
                list.remove(value);
        }*/

        Iterator < Integer > iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println("The value of the List is:" + value);
            if (value.equals(3)) list.remove(3);
        }

        ListIterator < Integer > listIterator = list.listIterator();

        System.out.println(listIterator.hasNext());


    }
}
