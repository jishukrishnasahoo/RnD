package spring.com.springweb;


interface InterfaceB extends InterfaceA{
    default void doSomthing() {
        System.out.println("doSomthing in InterfaceB");
    }
}