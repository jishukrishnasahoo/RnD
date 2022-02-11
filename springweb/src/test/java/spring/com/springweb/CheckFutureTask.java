package spring.com.springweb;

import java.util.concurrent.*;

import static java.lang.System.currentTimeMillis;
import static java.lang.System.setOut;

public class CheckFutureTask
{

    public static void main(String[] args) {
        Long startTime = currentTimeMillis();
        parallelExecution1();
        //normalExecution();
        System.out.println("Time consumed...."+ (currentTimeMillis() - startTime));


    }

    static Callable callable = new Callable() {
        @Override
        public Integer call() throws Exception {
            return findNumber(500);
        }
    };

    static Integer findNumber(int number) {
        int i;
        for (i = 0; i < number; i++) {
            System.out.println(i);
        }
        return i;
    }


    static Integer normalExecution()
    {
        int i1 = findNumber(500);
        int i2 = findNumber(500);
        int i3 = findNumber(500);

        int sum = i1+i2+i3;
        return sum;
    }

    static Integer parallelExecution() {
        Integer result= 0 ;

        FutureTask<Integer> i4 = new FutureTask<>(callable);
        FutureTask<Integer> i5 = new FutureTask<>(callable);
        FutureTask<Integer> i6 = new FutureTask<>(callable);

        new Thread(i4).start();
        new Thread(i5).start();
        new Thread(i6).start();

        try {
            result= i4.get()+i5.get()+i6.get();
        } catch (InterruptedException e) {

        } catch (ExecutionException e) {

        }
        return result;
    }

    static Integer parallelExecution1() {
        CompletableFuture completableFuture = new CompletableFuture();
        completableFuture.supplyAsync(() -> findNumber(500));

        Integer res = null;
        try {
            Boolean aBoolean = completableFuture.isDone();
            System.out.println(aBoolean);
        } catch (Exception e) {

        }
        return res;
    }

}