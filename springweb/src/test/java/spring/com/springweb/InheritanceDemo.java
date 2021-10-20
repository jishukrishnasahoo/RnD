package spring.com.springweb;

class InheritanceDemo extends InterfaceDemo implements Cloneable
{

    public static void main (String args []) throws Exception{

        InterfaceDemo obj = new InheritanceDemo();
        obj. hello();
        System.out.println("class of object"+ obj.getClass());
        System.out.println("hashcode"+ obj.hashCode());
        Object cloneObj = new InheritanceDemo().clone();
        System.out.println("clone equaity"+ new InheritanceDemo() == cloneObj);
    }

    static void hello ()
    {
        System.out.println("print InheritanceDemo");
    }

}
