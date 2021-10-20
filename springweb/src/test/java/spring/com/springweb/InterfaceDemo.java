package spring.com.springweb;

public class InterfaceDemo implements TestInterface {

    public static void main(String[] args) throws Exception {

        // Call Interface method as Interface
        // name is preceding with method

        TestInterface obj = new InterfaceDemo();
        TestInterface.hello();
        // Call Class static method
        hello();
    }

    // Class Static method is defined
    static void hello()
    {
        System.out.println("Called from Class");
    }
}