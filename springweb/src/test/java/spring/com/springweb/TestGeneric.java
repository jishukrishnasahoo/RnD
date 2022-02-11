package spring.com.springweb;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class TestGeneric<T>
{
    T obj;

    public TestGeneric(T obj) {
        this.obj = obj;
    }

    public T getObj()
    {
        return this.obj;
    }
}

class Main
{
    public static void main(String[] args) {
        TestGeneric<Integer> integerTestGeneric = new TestGeneric<>(10);
        TestGeneric<String> stringTestGeneric = new TestGeneric<>("Jishu");
        System.out.println(integerTestGeneric.getObj());
        System.out.println(stringTestGeneric.getObj());

        String[] array= new String[]{"A1", "B2", "A2", "B1", "C1", null };
        List<String> strings = Arrays.asList(array);
        List<String> mutabale = new ArrayList<>(strings);
        mutabale.addAll(strings);
        mutabale.removeAll(Collections.singleton(null));
        Collections.addAll(mutabale, array);
        List list = mutabale.stream().filter((i) -> i.startsWith("A") || i.startsWith("A")).collect(Collectors.toList());
        System.out.println(list);

    }
}


