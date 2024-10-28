package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class PrefixSuffixDelimiter {
    public static void main(String[] args) {
        
        List<String> lsitOfstring = Arrays.asList("Sachin", "Rohit", "Manish", "Kartik");
        String collect = lsitOfstring.stream().collect(Collectors.joining(", ", "[ ", " ]"));
        System.out.println(collect);
    }
}
