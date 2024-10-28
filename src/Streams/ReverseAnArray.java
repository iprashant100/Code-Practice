package Streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseAnArray {
    public static void main(String[] args) {
        
        int[] arrys = {45,12,47,63,25};
        int[] reversedArray = IntStream.rangeClosed(1, arrys.length).map(i -> arrys[arrys.length-i]).toArray();
        System.out.println(Arrays.toString(reversedArray));
    }
}
