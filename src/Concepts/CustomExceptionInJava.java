package Concepts;

public class CustomExceptionInJava extends CustomExceptionCustom {

    public CustomExceptionInJava(String message) {
        super(message);
        
    }

    public static void main(String[] args) throws CustomExceptionCustom {
        

        try {
            
        } catch (Exception e) {
           throw new CustomExceptionCustom("custom exception ");
        }
    }
}


class CustomExceptionCustom extends Exception{

    public CustomExceptionCustom(String message){
         super(message);
    }
}