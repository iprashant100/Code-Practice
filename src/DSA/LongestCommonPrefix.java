package DSA;

import java.util.*;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        
    
    List<String> lst1 = Arrays.asList("follow", "following", "follower");
    lst1.stream().reduce((a, b) -> {
        StringBuffer sb = new StringBuffer();
       for(int i=0; i<Math.min(a.length(), b.length()); i++){
        if(a.charAt(i)== b.charAt(i)){
            sb.append(a.charAt(i));
        }
        else{
            break;
        }
       }
       return sb.toString();
    });
}
}