package DSA;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ConsecutiveNumbers {
    public static void main(String[] args) {
        
    
Integer[] price = {1,2,3,4,5,6};
int[] price1 = {1,2,3,4,5,6};
Integer n = price.length;

Integer sum = Arrays.stream(price).mapToInt(Integer::intValue).sum();
Integer max = Arrays.stream(price).mapToInt(Integer::intValue).max().getAsInt();
Integer min = Arrays.stream(price).mapToInt(Integer::intValue).min().getAsInt();

Integer sum1 = IntStream.range(0, price.length).map(p -> price[p]).sum();

  Integer max1 = IntStream.of(price1).max().getAsInt();

  Integer sumofArr = 0;

  for(int i =0; i<price.length; i++){
    sumofArr += price[i];
  }

  if(max-min == n-1 && (sum == (n*(min + max)/2))){
    System.out.println("consecutive");
  }

}
}