package DSA;

import java.util.Arrays;

public class ReverseAnArray {
public static void main(String[] args) {
    
    Integer[] arr1 = {10,12,14,8,6};
    int length = arr1.length-1;
    for(int i=length/2; i>=0; i--){
        int temp = arr1[i];
        arr1[i] = arr1[length-i];
        arr1[length-i] = temp;

    }
    System.out.println("reversedarray" + Arrays.toString(arr1));

    // two pointer approach
    Integer start =0;
    Integer end = arr1.length-1;
    while (start<end) {
        Integer temp = arr1[start];
        arr1[start] = arr1[end];
        arr1[end] = temp;
        start++;
        end--;
    }
    System.out.println(Arrays.toString(arr1));
}
}
