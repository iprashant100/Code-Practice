package Streams;

import java.util.*;

public class SortStringsLengthWise {
    public static void main(String[] args) {
        
        List<String> lst = Arrays.asList("python", "java", "ml", "rust");
        lst.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }
}
