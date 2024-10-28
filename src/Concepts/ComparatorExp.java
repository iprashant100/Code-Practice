package Concepts;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExp implements Comparator<Integer> {
    public static void main(String[] args) {
        List<Integer> lst1 = Arrays.asList(12,45,78,36,25);

    Collections.sort(lst1, new ComparatorExp());


    //anotherway
    Comparator<Integer> comp1 = (a,b) -> (a>b)?-1:a<b?1:0;
    Collections.sort(lst1, comp1);
    
    }

@Override
public int compare(Integer a, Integer b) {
  return (a>b)?-1:a<b?1:0;
}
}