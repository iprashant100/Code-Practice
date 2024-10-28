package DSA;

public class MaxSumOfArrayOfThree {
public static void main(String[] args) {
    
    System.out.println(findMaxSumOfArray(new int[]{4,2,1,6,7,4,3}, 3));
}

public static int findMaxSumOfArray(int[] array1, int k){
    int currentRunningSum= 0;
    int maxV = Integer.MIN_VALUE;
    for(int i=0; i< array1.length; i++){
        currentRunningSum += array1[i];
        if(i >= k-1){
            maxV = Math.max(maxV, currentRunningSum);
            currentRunningSum = currentRunningSum -array1[i-(k-1)];
        }
    }
    return maxV;
}
}
