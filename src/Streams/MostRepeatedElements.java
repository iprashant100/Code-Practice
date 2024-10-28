package Streams;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;

public class MostRepeatedElements {

    public static void main(String[] args) {
        
    
    List<String> lst1 = Arrays.asList("hen", "den", "ten", "men", "hen");
        Map<String, Long> collect = lst1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //maximum occurance of an element
        String  keyV = collect.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        System.out.println(keyV);
}
}
