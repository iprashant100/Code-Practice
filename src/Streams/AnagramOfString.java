package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramOfString {
    public static void main(String[] args) {
        
        List<String> lst1 = Arrays.asList("and", "dan", "man", "nam");
        Map<String, List<String>> collect = lst1.stream().collect(Collectors.groupingBy(p-> p, Collectors.filtering(p -> p.matches(p),  Collectors.toList())));
        System.out.println(collect);
        
    }
}
