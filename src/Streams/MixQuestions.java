package Streams;

import java.util.*;

public class MixQuestions {
    public static void main(String[] args) {
        
        List<Integer> lst1 = Arrays.asList(45,78,1,23,45);
        
        // find hte number whose index starts with 1
        lst1.stream().map(p -> p +"").filter(s -> s.startsWith("1")).forEach(System.out::println);

        //removing the dublicates from the array
        Set<Integer> hset = new HashSet<>();
        lst1.stream().filter(i -> !hset.add(i)).forEach(System.out::println);

        // find first element in the arrray

        lst1.stream().findFirst().ifPresent(System.out::println);
        
    }
}
