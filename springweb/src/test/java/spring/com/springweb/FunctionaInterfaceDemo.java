package spring.com.springweb;


import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionaInterfaceDemo{

    public static void main (String arf [])
    {
        Function<Double, Double> f = type -> type/2.0;

        System.out.println(f.apply(10.6));

        BiConsumer<Integer, Integer> bc = (i1, i2) -> System.out.println(i1+i2);
        bc.accept(9,9);

        Supplier<Integer> supplier = () -> arf.length;
        System.out.println(supplier.get());

        String name = "Jishu";

        
    }

}