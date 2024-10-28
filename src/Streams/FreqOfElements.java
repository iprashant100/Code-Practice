import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqOfElements {
    public static void main(String[] args) {
        
        List<String> str = Arrays.asList("tech", "alert", "final", "tech");

        Map<String, Long> newList = str.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(newList);
        
    }
}
