
package spring.com.springweb;

class TestThread extends Thread{
    public void run(){
        System.out.println("running thread name is:"+Thread.currentThread().getName());
        System.out.println("running thread priority is:"+Thread.currentThread().getPriority());

    }
    public static void main(String args[]){
        TestThread m1=new TestThread();
        TestThread m2=new TestThread();
        m1.setName("1st");
        m2.setName("2nd");
        m1.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY);
        m1.start();
        m2.start();
        Runnable r = new Runnable() {
            @Override
            public void run() {

            }
        };

    }
}