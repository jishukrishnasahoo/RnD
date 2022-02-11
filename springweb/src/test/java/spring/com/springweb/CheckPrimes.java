package spring.com.springweb;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CheckPrimes
{
    private static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, (int) (Math.sqrt(number)))
                .allMatch(n -> number % n != 0);
    }
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);
        List result = primes.stream().mapToInt(j -> j).filter(i -> isPrime(i)).boxed().collect(Collectors.toList());
        System.out.println(result);

        System.out.println(primes.stream().mapToInt(i -> i).summaryStatistics().getMax());
        //collect(Collectors.groupingBy(Function.<Character>identity(), LinkedHashMap::new, Collectors.counting()))

        System.out.println((Object) primes.stream().collect(Collectors.groupingBy(Function.<Integer>identity(), LinkedHashMap::new, Collectors.counting())));

        System.out.println(Math.sqrt(2));

    }
}