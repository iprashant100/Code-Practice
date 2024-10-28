package DSA;

import java.util.Arrays;

public class TwoSumProblem {
    public static void main(String[] args) {
        
        Integer[] arr1 = {4,5,6,7,8};
        Integer target = 12;
        Arrays.sort(arr1);
        for(int i =0; i<arr1.length; i++){
            for(int j = 1; j<arr1.length; j++){
                if(arr1[i] + arr1[j] == target){
                    System.out.println("the numbers are" +arr1[i] + arr1[j]);
                }
            }
        }
    }
}
