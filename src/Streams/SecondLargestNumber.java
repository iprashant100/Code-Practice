package Streams;

import java.util.*;

public class SecondLargestNumber {

    public static void main(String[] args) {
        
        List<Integer> lst1 = Arrays.asList(4,5,7,8,9,6,3);
        Integer secondlargestNumber = lst1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondlargestNumber);
    }
}
