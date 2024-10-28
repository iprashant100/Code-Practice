package Streams;

public class Transactions {
    private String category;
    private int amount;
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public Transactions(String category, int amount) {
        this.category = category;
        this.amount = amount;
    }
    @Override
    public String toString() {
        return "Transactions [category=" + category + ", amount=" + amount + "]";
    }

    
}
