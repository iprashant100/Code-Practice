import java.util.*;
import java.util.stream.Collectors;

public class SecondLargestElementinArray {
    public static void main(String[] args) {
        List<Integer> lst1 = Arrays.asList(5,4,7,8,9,6,3);
        lst1.stream().map(s -> s+ "").filter(s -> s.startsWith("4")).forEach(System.out::println);
        
    }
}
