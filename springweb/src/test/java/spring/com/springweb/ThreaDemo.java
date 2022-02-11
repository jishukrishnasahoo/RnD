package spring.com.springweb;

import java.time.LocalDate;
import java.util.Date;
import java.util.function.BinaryOperator;

class ThreadDemo implements BinaryOperator
{
    public static void main(String args[])
    {
        Date date = new Date();
        // create anonymous inner class object
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("New thread created");
            }
        }).start();
        new Thread (() -> System.out.println("new thread")).start();
    }

    @Override
    public Object apply(Object o, Object o2) {
        System.out.println("apply");
        return "apply";
    }


}