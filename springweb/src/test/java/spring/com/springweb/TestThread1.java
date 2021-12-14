package spring.com.springweb;


import java.util.Arrays;
import java.util.List;

class TestThread1 extends Thread{
    public void run(){
        getNames();
    }

    List<String> names = Arrays.asList("jishu", "krishna", "sahoo");

    public synchronized void getNames()
    {
        for (String name : names)
        {

            try {
                System.out.println(name);
                System.out.println(Thread.currentThread().getName());
                wait();
            } catch (InterruptedException e) {

            }
        }
    }

}