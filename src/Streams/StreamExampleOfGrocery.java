package Streams;

import java.util.Arrays;
import java.util.List;

public class StreamExampleOfGrocery {

    List<Transactions> transaction;

    public static void main(String[] args) {
        
        List<Transactions> t1 = Arrays.asList(new Transactions("Grocery", 2500),
        new Transactions("Entertainment", 5000),
        new Transactions("Utility", 4000));

        //calculate the total amount spent on grocery
        t1.stream().filter(p -> p.getCategory().contains("Grocery")).mapToInt(n -> n.getAmount()).sum();

        //use case 2 : find the average expense across all categories

        double orElse = t1.stream().mapToDouble(Transactions::getAmount).average().orElse(0.0);
        System.out.println(orElse);
    }

    
    
    
}
