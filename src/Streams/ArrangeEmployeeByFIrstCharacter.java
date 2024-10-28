package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class ArrangeEmployeeByFIrstCharacter {
    public static void main(String[] args) {
        
        List<String> lst1 = Arrays.asList("John", "jacob", "Jenny", "Kurt", "lenny", "tom", "jose");
        lst1.stream().collect(Collectors.groupingBy(p -> p.charAt(0))).entrySet().stream().forEach(e -> System.out.println(e.getKey() + " : "+ e.getValue()));
        
    }
}
