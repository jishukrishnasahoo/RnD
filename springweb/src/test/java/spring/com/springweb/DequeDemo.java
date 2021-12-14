package spring.com.springweb;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo
{

    public static void main(String ar [])
    {
        Deque deque = new ArrayDeque<>();
        deque.addFirst("j");
        deque.addLast("i");
        deque.add("s");
        System.out.println(deque.poll());
        System.out.println(deque);

    }

}