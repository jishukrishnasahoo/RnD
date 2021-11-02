package spring.com.springweb;

interface Sayable{
    void say();
}
public class MethodReference {
    public static void saySomething(){
        System.out.println("Hello, this is a non-static method.");
    }
    public static void main(String[] args) {
        //MethodReference methodReference = new MethodReference(); // Creating object
        // Referring non-static method using reference
        /*Sayable sayable = methodReference::saySomething;
        // Calling interface method
        sayable.say();
        // Referring non-static method using anonymous object
        Sayable sayable2 = new MethodReference()::saySomething; // You can use anonymous object also
        // Calling interface method
        sayable2.say();*/

        Sayable sayable = MethodReference::saySomething;
        sayable.say();
    }
}