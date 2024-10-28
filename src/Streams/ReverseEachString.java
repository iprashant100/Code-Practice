package Streams;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ReverseEachString {
    public static void main(String[] args) {
        
        String a = "life has no meaning";
        String collect = Arrays.stream(a.split(" ")).map(p -> new StringBuffer(p).reverse()).collect(Collectors.joining(" "));
        System.out.println(collect);
    }
}
