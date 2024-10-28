package Streams;

import java.util.*;

public class Reduce {
public static void main(String[] args) {
    
    List<Integer> lst1 = Arrays.asList()4,7,8,6,5);
    Integer reduce = lst1.stream().reduce(1, (a,b) -> a*b);
    System.out.println(reduce);
}
}
