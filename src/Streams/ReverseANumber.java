package Streams;

public class ReverseANumber {

    public static void main(String[] args) {
        
        Integer a = 123342;
        Integer rev =0;
        Integer rem;
        while(a > 0){
            rem = a %10;
            rev = rev *10 + rem;
            a = a/10;

        }
        System.out.println(rev);
    }
}
