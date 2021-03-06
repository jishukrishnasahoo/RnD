
package spring.com.springweb;

import java.util.Arrays;
import java.util.List;

class TestThread extends Thread{
    public void run(){
        getIndex();
        print();
    }

    static List<Integer> indexes = Arrays.asList(1,2,3);

    public synchronized void getIndex()
    {
        for (Integer i : indexes)
        {

            try {
                System.out.println(i);
                System.out.println(Thread.currentThread().getName());
                sleep(10, 12);
            } catch (Exception e) {

            }
        }
    }

    public synchronized void print()
    {
        System.out.println("In Print"+Thread.currentThread().getName());
    }

    public static void main(String args[]){
        TestThread a = new TestThread();
        //TestThread b = new TestThread();
        Thread m1=new Thread(a);
        Thread m2=new Thread(a);
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