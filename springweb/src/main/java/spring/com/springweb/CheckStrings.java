package spring.com.springweb;

import java.util.*;

public class CheckStrings {
    static String a = new String("Jishu Krishna Sahoo");

    public static void main (String [] arg) {

        String a = "abc";

        String b = "";

        for (int i=a.length()-1; i>=0; i--){
            b += a.charAt(i);

        }

        System.out.println("jishu"+ b);



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
        System.out.println("name list"+nameList.toString());
        System.out.println("reverse string"+resultList.toString());

        StringBuffer sb = new StringBuffer();
        System.out.println("sb"+sb);

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
        //hashcode1597143450

        String s1 = "c,jishu,krishna,sahoo";
        /*String s2 = "sahoo";
        s1 = (s1+s2);
        s2 = s1.substring(0,5);*/
       // s1= s1.trim();

      /*  String a = "newnew delhi new".intern();
        String b = new String("new delhi");
        String c = new String("new delhi");
        //a= a.substring(2,5);


        StringBuilder sbr = new StringBuilder("jishu krishna sahoo");

        //System.out.println(s1+s2);
        //Initial a lovely day not
       // System.out.println("replace " + a.replace('1', 'a'));

        System.out.println("replaceAll " + a.replaceAll("ew", "g"));

        //System.out.println("SBR " + sbr.replace(6, 13, "JK"));

        //System.out.println("last inex"+s1.split("jishu"));
        for (String s: s1.split(",", 2))
        {
            System.out.println(s);
        }

        System.out.println("---a---" + a.hashCode() + "---b---" + b.hashCode()+ "---c---"+ c.hashCode());

        System.out.println("===" + new Object().hashCode());*/



    }

}