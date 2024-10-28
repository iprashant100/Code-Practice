package Streams;

public class PrimeNumber {
    public static void main(String[] args) {
        
        System.out.println(isaPrimeNUmber(45));
    }

    private static boolean isaPrimeNUmber(int num) {
     if(num ==0 || num ==1){
        System.out.println("the number is not a prime number");
     }
     if(num ==2){
        System.out.println("prime");
     }
     for(int i=2; i<num/2; i++){
        if(num %i==0){
            return false;
        }
     }
       return true;
    }
}
