package Streams;

import java.util.stream.IntStream;

public class Pallindrome {

    public static void main(String[] args) {
        
        String str = "malalam";
        Boolean isPallindrome =IntStream.range(0, str.length()/2).noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i -1));

        if(isPallindrome){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
