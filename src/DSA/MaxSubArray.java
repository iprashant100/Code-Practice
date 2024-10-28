package DSA;

public class MaxSubArray {

    
public static void main(String[] args) {
    int[] a = {-3, -4, 1, -2, 1, 5, -3, 8};

    System.out.println("maxSubArray is  " + maxSubArraySum(a));
}

 static int maxSubArraySum(int a[]) {
    int size = a.length;
    int max = Integer.MIN_VALUE;
    int currentMax = 0;

    for(int i=0; i < size; i++){
        currentMax = currentMax + a[i];
        if(max < currentMax)
             max = currentMax;
        if(currentMax < 0);
            currentMax = 0;
    }
    return max;
}
}
