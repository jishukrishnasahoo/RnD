package spring.com.springweb;

interface InterfaceA {
    default void doSomthing() {
        System.out.println("doSomthing in InterfaceA");
    }
}