import java.util.*;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> lst1 = Arrays.asList(4,8,6,9,7,2,3);
        List<Integer> collectEven = lst1.stream().filter(p -> p%2 ==0).collect(Collectors.toList());
        List<Integer> collectOdd = lst1.stream().filter(p -> p%2 !=0).collect(Collectors.toList());
        System.out.println(collectEven.toString());
        System.out.println(collectOdd.toString());
        
       
    }
}
