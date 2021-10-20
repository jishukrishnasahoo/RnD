package spring.com.springweb;

import java.util.*;
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
    }
}