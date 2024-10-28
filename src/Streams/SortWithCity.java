package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class SortWithCity {
    public static void main(String[] args) {
        
        List<String> city = Arrays.asList("Bom-123", "KOL-451", "DEL-410", "IND-113", "PUN-475");
        Map<String, List<String>> collect = city.stream().collect(Collectors.groupingBy( p -> p.substring(0, 3) ));
        System.out.println(collect);
    }
}
