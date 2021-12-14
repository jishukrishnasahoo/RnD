
package spring.com.springweb;

import java.util.Arrays;
import java.util.List;

class TestThread extends Thread{
    public void run(){
        getIndex();
    }

    static List<Integer> indexes = Arrays.asList(1,2,3);

    public synchronized void getIndex()
    {
        for (Integer i : indexes)
        {

            try {
                System.out.println(i);
                System.out.println(Thread.currentThread().getName());
                wait(10);
                System.out.println("kkkkk");

            } catch (InterruptedException e) {

            }
        }
    }

    public static void main(String args[]){
        TestThread a = new TestThread();
        TestThread1 b = new TestThread1();
        Thread m1=new Thread(a);
        Thread m2=new Thread(b);
        m1.setName("idReader");
        /*m1.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY);*/
        m2.setName("nameReader");

        m2.start();
        m1.start();
        //m3.start();
        Runnable r = new Runnable() {
            @Override
            public void run() {

            }
        };

        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
        int sum = listOfNumbers.parallelStream().reduce(0, Integer::sum)+5;

        //System.out.println(sum);
    }
}