package spring.com.springweb;

import java.util.HashMap;

public class HasmapMechanism {



    public static void main(String [] ar)
    {
        Book b1 = new Book("java", "jk", 4);
        Book b2 = new Book("java", "jk", 4);
        HashMap<Book, Object> a = new HashMap();
        a.put(b1, "jishu");
        a.put(b2, "krishna");
        System.out.println(a.toString()+ "    "+ a.get(b1));
    }

}