package Streams;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramWithoutUsingSort {

    public static void main(String[] args) {
        
        String a = "Racecar".toLowerCase();
        String b = "Carrace".toLowerCase();

    
       LinkedHashMap<String, Long> coll1 = Stream.of(a.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
       LinkedHashMap<String, Long> coll2 = Stream.of(b.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

       if(coll1.equals(coll2)){
        System.out.println("anagram");
       }else{
        System.out.println("not an anagram");
       }
    }

}
