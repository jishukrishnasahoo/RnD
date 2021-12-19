package spring.com.springweb;

import org.apache.kafka.common.protocol.types.Field;

import java.util.*;

public class StackDemo {
    public StackDemo() {
        System.out.println("jishu");
    }

    public static String getName()
    {
        return "jishu";

    }

    public static String getName(String name)
    {
        return name;
    }
    public static void main(String ar[]) {

        Stack stack = new Stack();
        stack.add("j");
        stack.add("i");
        stack.add("s");
        System.out.println(stack.pop());

        Queue queue = new LinkedList<>();

        queue.add("k");
        queue.add("r");
        queue.add("i");
        //queue.poll();
        System.out.println(queue.poll());
        System.out.println(queue);

        Hashtable hashtable = new Hashtable();
        hashtable.put(1,"J");
        main("main", 1);
        StackDemo s = new StackDemo();
        System.out.println(s);
        System.out.println(StackDemo.getName("krish"));

        SortedSet ss = new TreeSet<>();

    }

    public static void main(String a, Integer i)
    {
        System.out.println(a);
    }
}