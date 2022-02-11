package spring.com.springweb;

import org.assertj.core.util.Lists;

import java.util.*;
import java.util.stream.Collectors;

public class HasmapMechanism {



    public static void main(String [] ar)
    {
        MyBook b1 = new MyBook("java", "jk", 400);
        MyBook b2 = new MyBook("j2ee", "jk", 401);
        MyBook b3 = new MyBook("linux", "john", 402);
        MyBook b4 = new MyBook("linux1", "john", 403);
        HashMap<MyBook, Object> a = new HashMap();
        a.put(b1, "jishu");
        Object put = a.put(b2, "krishna");
        //Object put1 = a.put(b2, "krish");
        a.put(null, "sahoo");
        a.put(null, null);
        a.put(null, null);

        Set keys = a.keySet();
        System.out.println(a.toString() + "    "+ a.get(b1));
        keys.remove(b1);
        keys.add(b3);//throw usupported operation exception defined in Abstractcollection.java
        System.out.println(""+ a.keySet());

        Map<Integer, Integer> newmap = new HashMap();
        //{4,6}, {6,5}, {7,3}, {4,5}

        List li = new LinkedList<>();
        li.add(0, Arrays.asList(4,6));
        li.add(1, Arrays.asList(6,5));
        li.add(2, Arrays.asList(7,3));
        li.add(3, Arrays.asList(4,5));





    }

}