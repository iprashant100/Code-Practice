import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CommonElementsBetweenTwoArrays {
    public static void main(String[] args) {

        List<Integer> lst1 = Arrays.asList(5, 7, 8, 9, 6, 3);
        List<Integer> lst2 = Arrays.asList(42, 4, 5, 7, 8);

        lst1.stream().filter(lst2::contains).forEach(System.out::println);

    }
}
