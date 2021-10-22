package spring.com.springweb;

class InheritanceDemo extends InterfaceDemo implements Cloneable
{

    public static void main (String args []) {

        InterfaceDemo obj = new InheritanceDemo();
        System.out.println("class of object"+ obj.getClass());
        System.out.println("hashcode"+ obj.hashCode());
        System.out.println("clone equaity"+ new InheritanceDemo());
    }

    void hello ()
    {
        System.out.println("print InheritanceDemo");
    }

}
