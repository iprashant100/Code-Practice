import java.util.*;
import java.util.stream.Collectors;

public class MaxAndMin {
    public static void main(String[] args) {
        List<Integer> lst1 = Arrays.asList(45,78,12,23,56,89);
        Integer max = lst1.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);
        Integer mininteger = lst1.stream().min(Comparator.naturalOrder()).get();
        System.out.println(mininteger
        );
    }
}
