import java.util.function.Function;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeUnsortedArrays {
        public static void main(String[] args) {
            List<Integer> lst1 = Arrays.asList(4,5,6,8,9);
            List<Integer> lst2 = Arrays.asList(1,2,3,7,19);
            
            List<Integer> collect = Stream.concat(lst1.stream(),lst2.stream()).collect(Collectors.toList());
          System.out.println(collect);
            
        }
}
