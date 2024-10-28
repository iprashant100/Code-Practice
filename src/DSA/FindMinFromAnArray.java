package DSA;

public class FindMinFromAnArray {
    public static void main(String[] args) {
        
        Integer[] arr1 = {12,23,34,11,14,10};
        Integer temp = arr1[0];
        for(int i=0; i<arr1.length; i++){
            if(arr1[i] < temp){
                temp = arr1[i];
            }
        }
        System.out.println(temp);
    }
}
