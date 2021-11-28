package spring.com.springweb;


import org.assertj.core.data.MapEntry;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo
{
    public static void main (String ar []){
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        //numbers.addAll(0, Arrays.asList(9, 10, 3, 4, 7, 3));
       // List<Integer> nuberList = numbers.stream().flatMap(element -> element * element).distinct().collect(Collectors.toList());

        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 31, 31, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream().mapToInt(x -> x).summaryStatistics();

        //Map<> sortedList = primes.stream().filter(element -> element > 10).sorted((a, b) -> b.compareTo(a)).collect(Collectors.toMap(new Object(), o -> o));

        Long count = primes.stream().filter(element -> element > 10).sorted((a, b) -> b - a).distinct().count();

        Boolean allmatch = primes.stream().filter(element -> element > 10).sorted((a, b) -> b - a).anyMatch(e1 -> e1 > 30);

        Boolean empty = Stream.empty().noneMatch(a -> a.equals("123"));

         primes.stream().forEachOrdered(a1 -> a1.toString());

        System.out.println(Stream.empty().findFirst());
        System.out.println(stats);

        List<List<Integer>> mapList = Arrays.asList(Arrays.asList(1,2,3,4,5));

        List<List<Integer>> finalList = mapList.stream().map(list -> list.stream().collect(Collectors.toList())).collect(Collectors.toList());
        List l = mapList.stream().map(lst -> lst.stream().collect(Collectors.toList())).collect(Collectors.toList());



        Map<Integer, String> studentsMap = new HashMap<>();
        studentsMap.put(8, "jai");
        studentsMap.put(6, "omm");
        studentsMap.put(2, "chak");

        List Students = studentsMap.entrySet().stream().sorted((s1,s2) -> s1.getValue().compareTo(s2.getValue())).collect(Collectors.toList());
        Map newStudentsMap = studentsMap.entrySet().stream().sorted((s1,s2) -> s1.getValue().compareTo(s2.getValue())).collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry::getValue, (e1,e2) -> e1));
        Map newStudentsMap1 = studentsMap.entrySet().stream().sorted(Map.Entry.<Integer, String>comparingByValue()).collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap :: new));

        Map newStudentsMap2 = studentsMap.entrySet().stream().sorted(Map.Entry.<Integer, String>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap:: new));


                        System.out.println("Students" + l);
    }

}