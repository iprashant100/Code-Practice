import java.util.*;
import java.util.stream.Collectors;

public class ExtractDuplicateElementInList {
    public static void main(String[] args) {
        List<String> dubList = Arrays.asList("life", "death", "age", "life");
        Set<String> setOfVal = new HashSet<>();
        Set<String> collect = dubList.stream().filter(p -> !setOfVal.add(p)).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
