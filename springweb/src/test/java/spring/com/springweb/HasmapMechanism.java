package spring.com.springweb;

import java.util.HashMap;

public class HasmapMechanism {



    public static void main(String [] ar)
    {
        Book b1 = new Book("java", "jk", 400);
        Book b2 = new Book("j2ee", "jk", 401);
        Book b3 = new Book("linux", "john", 402);
        Book b4 = new Book("linux1", "john", 403);
        HashMap<Book, Object> a = new HashMap();
        a.put(b1, "jishu");
        a.put(b2, "krishna");
        System.out.println(a.toString()+ "    "+ a.get(b1));
        System.out.println(a.toString()+ "    "+ a.get(b2));
    }

}