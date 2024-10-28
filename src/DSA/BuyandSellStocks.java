package DSA;

import javax.swing.text.StyleConstants;

public class BuyandSellStocks {
public static void main(String[] args) {
    int [] stock = {7,1,5,3,6,4};
    int profit = 0;
    for (int i = 0; i < stock.length-1; i++) {
        if(stock[i+1] > stock[i]){
        for (int j = i+1; j < stock.length; j++) {
            Integer currentProfit = stock[j] - stock[i];
            if(currentProfit > profit){
                profit = currentProfit;
            }
        }
        
    }}
    System.out.println(profit);
}

}
