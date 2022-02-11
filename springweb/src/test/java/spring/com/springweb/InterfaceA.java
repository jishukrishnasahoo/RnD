package spring.com.springweb;

public interface InterfaceA extends InterfaceB{
    public static final int id = 0;

    default void doSomthing() {
        System.out.println("doSomthing in InterfaceA");
    }

    public static String getSomething ()
    {
        System.out.println("get something in Interface");
        return "";
    }

    default int hashcode()
    {
        return 123;
    }


    default void print()
    {

    }
}