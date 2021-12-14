package spring.com.springweb;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackDemo
{
    public static void main (String ar[])
    {

        Stack stack = new Stack();
        stack.add("j");
        stack.add("i");
        stack.add("s");
        //System.out.println(stack.push("h"));

        Queue queue = new PriorityQueue<>();

        queue.add("k");
        queue.add("r");
        queue.add("i");
        System.out.println(queue.remove("k"));
        System.out.println(queue);
    }
}