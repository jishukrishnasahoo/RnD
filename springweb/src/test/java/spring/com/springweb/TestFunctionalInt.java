package spring.com.springweb;

public class TestFunctionalInt
{

    public static void main(String a [])
    {
        FunctionInt fi = (i1,i2) -> i1+i2;

        int t = fi.add(1,2);

        System.out.println(t);

        Runnable r =()-> System.out.println("Jis");
        r.run();
    }
}