package spring.com.springweb;

import java.util.*;

public class CheckStrings {
    static String a = new String("Jishu Krishna Sahoo");

    public static void main (String [] arg) {
        LinkedList<Character> nameList = new LinkedList<>();
        int i = a.length();
        System.out.println("Output  "+i);
        for (int j=0; j < i; j++)
        {
           nameList.add(j, a.charAt(j));
        }
        Iterator iterator = nameList.descendingIterator();
        List<Object> resultList = new ArrayList<>();
        while (iterator.hasNext())
        {
            resultList.add(iterator.next());
        }
        System.out.println(nameList.toString());
        System.out.println(resultList.toString());

        StringBuffer sb = new StringBuffer();
        System.out.println(sb);

        for (Object obj : nameList)
        {
            sb.append(obj);
        }
        System.out.println(sb);
        System.out.println(sb);

        ListIterator li = nameList.listIterator();
        nameList.addAll(5,new ArrayList(Arrays.asList('a','b')));
       // li.add("BCET");
        while (li.hasNext())
        {

            System.out.println(nameList.toString());
            break;
        }

    }

}