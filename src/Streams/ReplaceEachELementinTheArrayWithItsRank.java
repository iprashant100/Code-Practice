package Streams;

import java.util.Arrays;

public class ReplaceEachELementinTheArrayWithItsRank {
    public static void main(String[] args) {
        
        int[] arr1 = {100,2,70,12,90};
        int newArray[] =Arrays.copyOfRange(arr1, 0, arr1.length);

        //sort the array
        Arrays.sort(newArray);

        for(int i=0; i< arr1.length; i++){

            for(int j =0; j< arr1.length; j++){
                if(newArray[j] == arr1[i]){
                    arr1[i] = j+1;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
