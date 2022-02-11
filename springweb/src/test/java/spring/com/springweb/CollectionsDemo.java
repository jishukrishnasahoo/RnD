package spring.com.springweb;

import org.apache.kafka.common.protocol.types.Field;
import org.assertj.core.util.Lists;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionsDemo
{

    public static void main(String ar []) {
        List<String> list = Arrays.asList("j", "i", "s", "h", "u");

        List<String> mutabale = new ArrayList<>();
        mutabale.add("j");
        mutabale.add("i");
        mutabale.add("s");
        mutabale.add("h");
        mutabale.add("u");
        mutabale.add("i");
        mutabale.add(null);
        mutabale.add(null);
        mutabale.add(null);

        //Collections.unmodifiableList(list);

        ArrayList<ArrayList<Integer>>  lists= new ArrayList<>();
        List sync = mutabale.stream().sorted(Comparator.nullsFirst(String::compareTo)).collect(Collectors.toList());

        lists.add(new ArrayList());
        lists.get(0).add(0,0);
        mutabale.removeAll(Collections.singleton("i"));
        List listWithoutNull = mutabale.stream().filter((e)-> e != null).collect(Collectors.toList());

        List listWithDuplicates = Lists.newArrayList(0,1,1,2,3,2,3);
        List listWithoutDuplicates = new ArrayList<>( new HashSet<>(listWithDuplicates));

        List<String> colourList = Arrays.asList("red", "blue", "blue", "green", "red");
        List<String> otherList = Arrays.asList("red", "green", "green", "yellow");
        Set dup = new HashSet<>();

        Long e =  listWithDuplicates.stream().filter((i)-> !dup.add(i)).count();

        Long count = colourList.stream().distinct().filter((i)-> otherList.contains(i)).count();

        List listOne = Arrays.asList("Jack", "Tom", "Sam", "John", "James", "Jack");
        List listTwo = Arrays.asList("Jack", "Daniel", "Sam", "Alan", "James", "George");

        List diff = new ArrayList<>(listOne);
        diff.removeAll(listTwo);

        HashSet ts = new HashSet();
        List i = Collections.unmodifiableList(listOne);
        //Collections.reverse(i);

        ts.add(null);
        ts.add(4);
        ts.add(2);
        ts.add(0);
        ts.add(2);
        ts.add("jishu");
        ts.add(2.3);
        ts.add(null);

        System.out.println("hashset"+ts);

        Hashtable kv = new Hashtable();

        kv.put(1,"j");
        String join = (String)listOne.stream().collect(Collectors.joining("|"));

        System.out.println(mutabale);
        System.out.println(listWithoutDuplicates);


        System.out.println(sync);

        int[] numbers = new int[] { -8, 7, 5, 9, 10, -2, 3 };

        Arrays.sort(numbers);
        String[] strings = new String[] { "learning", "java", "with", "baeldung" };

        System.out.println("toString"+Arrays.toString(numbers));

        for (int j = 0; j < numbers.length; j++) {
            System.out.println(numbers[j]);
        }

        System.out.println("numbers"+numbers);

    }

}