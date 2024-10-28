import java.util.*;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExtractDuplicatesFromString {
    public static void main(String[] args) {
        String str = "all the problem in the world are superficial".replaceAll("\\s", "");

        Map<String, Long> collect = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        String repeatedChar = collect.entrySet()
                                .stream()
                                .filter(entry -> entry.getValue() >1)
                                .map(entry -> entry.getKey())
                                .findFirst().get();

                                System.out.println(repeatedChar);
       
    }
}
