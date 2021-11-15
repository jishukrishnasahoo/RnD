package spring.com.springweb;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

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
    Predicate<Integer> isBig = type -> type > 10;
    boolean a = isBig.test(12);

    Predicate<Integer> predicate = i ->
    {
        System.out.println("sadasd" +i);
        return true;
    };
    boolean b = predicate.test(10);

    BinaryOperator<Integer> bo = (o1, o2) -> o1 * o2;
    Integer i = bo.apply(5, 5);
}
