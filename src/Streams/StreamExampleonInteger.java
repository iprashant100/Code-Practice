package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExampleonInteger {

    public static void main(String[] args) {
        
        List<Integer> lst1 = Arrays.asList(45,12,23,56,78,97);

        lst1.stream().filter(p -> p%2 ==0).map(n -> n *n).distinct().collect(Collectors.toList());

        int amount = lst1.stream().filter(n -> n > 30).mapToInt(Integer::intValue).sum();

        long count = lst1.stream().filter(n -> n>25).distinct().count();

    }
}
