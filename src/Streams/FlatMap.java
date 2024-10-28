import java.util.*;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        
        List<Integer> lst1 = Arrays.asList(5,4,7,8,9,6,3);
        List<Integer> lst2 = Arrays.asList(10,11,12,13);

        List<List<Integer>> lstOfList = List.of(lst1, lst2);
        List<Integer> collect = lstOfList.stream().flatMap(p-> p.stream()).collect(Collectors.toList());
        System.out.println(collect);
        

    }
}
