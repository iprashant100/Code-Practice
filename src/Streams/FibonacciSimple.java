package Streams;

public class FibonacciSimple {
    public static void main(String[] args) {
        
        //fibonacci pattern 0,1,1,2,3,5,8,13
        
        Integer n = 10, n1 = 0, n2 =1;
        for(int i =0; i<n; i++){
            System.out.println(n1 +  " ");
            Integer sum = n1 +n2;
            n1 = n2;
            n2 = sum;
        }
    }
}
