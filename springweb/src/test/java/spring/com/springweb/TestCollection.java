package spring.com.springweb;

import java.lang.ref.WeakReference;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

class TestCollection{
     public static void main(String args[]){

        ArrayList<String> al=new ArrayList<String>();
        al.add("Biru");
        al.add("Saurav");
        al.add("Mukesh");
        al.add("Tahir");

        Collections.sort(al);
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

         Optional<String> s = null;

         //System.out.println("simple of" +Optional.of(s));

         System.out.println("nullabe" +al);

         ConcurrentHashMap conmap = new ConcurrentHashMap();
         Map<Integer, String> a = new HashMap<>();
         a.put(1,"J");
         a.put(null, null);

         conmap.put(2, "i");
         System.out.println(conmap);
         WeakReference<StringBuilder> reference = new WeakReference<>(new StringBuilder());
    }
}