package Streams;

public class PallindromeNormal {
    public static void main(String[] args) {
        
        String str = "malam";
        String rev = "";

        for(int i = str.length()-1; i >=0; i--){
            rev = rev + str.charAt(i);
        }

        if(str.toLowerCase().equals(rev.toLowerCase())){
            System.out.println("anagram");
        }else{
            System.out.println("not an anagram");
        }
    }
}
