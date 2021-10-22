package spring.com.springweb;

public class InterfaceDemo implements TestInterface {

    public boolean isNull(String str) {
        System.out.println("Impl Null Check");

        return str == null ? true : false;
    }

    public static void main(String args[]){
        InterfaceDemo obj = new InterfaceDemo();
       // obj.print("");
        obj.isNull("abc");
        TestInterface t = new TestInterface() {
            @Override
            public void print(String str) {

            }
        };
    }
}