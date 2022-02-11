package spring.com.springweb;


interface InterfaceB {
    default void doSomthing() {
        System.out.println("doSomthing in InterfaceB");
    }
    public static String getSomething ()
    {
        System.out.println("get something in Interface");
        return "";
    }
    default void print(){}
}