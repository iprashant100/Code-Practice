package Streams;


import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String a = "RaceCar";
        String b ="CarRace";

        a = Stream.of(a.split("")).map(String:: toLowerCase).sorted().collect(Collectors.joining(b));
        b = Stream.of(b.split("")).map(String:: toLowerCase).sorted().collect(Collectors.joining(b));

        if(a.equals(b)){
            System.out.println("The string is anagram");
        }
        else{
            System.out.println("the given string is not a anagram");
        }
        
    }
}
