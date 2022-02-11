package spring.com.springweb;

public class InterfaceDemo implements InterfaceB, InterfaceA {

    public boolean isNull(String str) {
        System.out.println("Impl Null Check");

        return str == null ? true : false;
    }

    @Override
    public void doSomthing() {

    }


    public String fetchSomething()
    {
        InterfaceB.getSomething();
        return "";
    }

    public static void main(String args[]){
        InterfaceDemo obj = new InterfaceDemo();
       // obj.print("");
        obj.isNull("abc");
        System.out.println(obj.hashCode());
        System.out.println(obj.fetchSomething());
        TestInterface t = new TestInterface() {
            @Override
            public void print(String str) {

            }
        };
    }
}