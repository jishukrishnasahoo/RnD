package spring.com.springweb;


import org.assertj.core.data.MapEntry;

import java.util.*;
import java.util.function.Function;
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
        System.out.println("*****************"+primes.stream().distinct().sorted((e1,e2) -> Integer.compare(e2,e1)).collect(Collectors.toList()).get(1));

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

       /* Map lst = studentsMap.entrySet().stream().sorted((Map.Entry.<Integer,String>comparingByKey().reversed())).collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue(), (e1,e2)->e2, LinkedHashMap :: new));


        Map newMap = studentsMap.entrySet().stream().sorted((s1,s2)-> s2.getValue().compareTo(s1.getValue())).collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry:: getValue, (e1,e2)->e1, LinkedHashMap::new));
        Map<Integer, String> map12 =
                studentsMap.entrySet()
                        .stream().sorted(Map.Entry.<Integer, String>comparingByKey())
                        .collect(Collectors.toMap(x -> x.getKey(), x-> x.getValue(), (c,v) -> v, LinkedHashMap::new));

        Integer sum = studentsMap.keySet().stream().reduce((i,j)-> i+j).get();

        Integer sum1 = studentsMap.entrySet().stream().map((x) -> x.getKey()).reduce((i, j) -> i + j).get();

        Integer nums = primes.stream().map((i)-> i*5).reduce((i1,i2)-> i1+i2).get().intValue();

        List<Integer> nl = Arrays.asList(1,2,3,4,5,6);
        Long nli = nl.stream().mapToInt(integer -> integer).summaryStatistics().getSum();



        String name = "jishu krishna sahoo";
        Character aa= name.chars().mapToObj(a -> Character.valueOf((char) a)).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet()
                .stream().filter(e1-> e1.getValue()==1L).map(j->j.getKey()).findFirst().get();

        Map map = name.chars().mapToObj((b)-> Character.valueOf((char)b)).collect(Collectors.groupingBy(Function.<Character>identity(), LinkedHashMap::new, Collectors.counting()));

        Character maxcount = name.chars().mapToObj((b)-> Character.valueOf((char)b)).collect(Collectors.groupingBy(Function.<Character>identity(), LinkedHashMap::new, Collectors.counting())).entrySet()
                .stream().filter((i)->i.getValue()==3L).map(j->j.getKey()).findFirst().get();

        primes.stream().mapToInt(i -> i).summaryStatistics();

        List rev = primes.stream().distinct().sorted(Collections.reverseOrder()).collect(Collectors.toList());

        System.out.println("Students" + newMap);*/

        Map<Integer, String> students = studentsMap.entrySet().stream().sorted((i, j) -> j.getKey().compareTo(i.getKey())).collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue(), (i1, i2) -> i2, LinkedHashMap::new));
        students.merge(3, "hi", (v1, v2)
                -> v1.equals(v2)
                ? v1
                : v1+ ","+v2);
        System.out.println("Students"+students.compute(2, (k, v) -> v.concat(" singh")));
    }

}