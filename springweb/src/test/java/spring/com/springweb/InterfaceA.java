package spring.com.springweb;

interface InterfaceA {
    public static final int id = 0;


    default void doSomthing() {
        System.out.println("doSomthing in InterfaceA");
    }

    public static String getSomething ()
    {
        System.out.println("get something in Interface");
        return "";
    }
}