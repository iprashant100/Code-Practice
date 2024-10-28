package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDublicates {
    public static void main(String[] args) {
        
        List<String> lst = Arrays.asList("New", "Old", "Old");
        List<String> collect = lst.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
    }
}
