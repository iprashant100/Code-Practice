package DSA;

import java.util.HashMap;
import java.util.Map;

public class TwoUsingHashMap {
public static void main(String[] args) {
    
    Integer[] arr1 = {4,5,6,7,8};
    Integer target = 12;
    Map<Integer, Integer> hmap = new HashMap<>();
    for(int i = 0; i<arr1.length; i++){
        hmap.put(arr1[i], i);
        if(hmap.containsKey(target - arr1[i])){
            System.out.printf("The value pair are %d , %d " ,arr1[i] ,target - arr1[i]);
        }
    }
}

}
