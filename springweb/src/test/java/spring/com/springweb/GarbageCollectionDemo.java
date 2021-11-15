package spring.com.springweb;

import java.util.Arrays;

public abstract class GarbageCollectionDemo
{
    public synchronized static void main (String ar [])
    {
        Runtime runtime = Runtime.getRuntime();
        long tm = runtime.totalMemory();
        System.out.println(tm);
        Object car = new Object();
        for (int i : Arrays.asList(1,2,3,4,5,6,7,8))
        {
            new Object();
        }
        System.out.println(runtime.freeMemory());
        runtime.gc();
        System.out.println(runtime.freeMemory());

    }
}