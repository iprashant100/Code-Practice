import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FreqOfChars {
    public static void main(String[] args) {
        String s = "hippotomuss";
        Map<String, Long> collect2 = Stream.of(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect2);
        }
}
