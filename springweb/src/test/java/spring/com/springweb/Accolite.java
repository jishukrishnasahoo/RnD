package spring.com.springweb;

import java.util.Set;
import java.util.stream.Collectors;

public class Accolite {
    int m =2;

    static boolean isInvalid(Set s1, Set s2)
    {
        return (s1.size() <2 || s2.size() <2) || (!isSame(s1,s2) && !isSame(s2,s1));

    }

    private static boolean isSame(Set s1, Set s2) {
        return s1.stream().allMatch(s -> s2.contains(s));
    }


    public static void main(String args[]) {
        Accolite d = new Accolite();
        String s= "aabbccaa";
        for (int i=2; i<s.length(); i++)
        {
            String s1 = s.substring(0,i);
            String s2 = s.substring(i);

            Set set1 = s1.chars().mapToObj(c->(char)c).collect(Collectors.toSet());
            Set set2 = s2.chars().mapToObj(c->(char)c).collect(Collectors.toSet());

            if(isInvalid(set1,set2))
            {
                //System.out.println(s1+":"+s2);
            }else
            {
                System.out.println(s1+":"+s2);
            }

        }



    }
}