package src.main.java.model;

public class Sale {
    private int id;
    private float totalCost;
    private String sellerUsername, date;

    public Sale(int id, float totalCost, String sellerUsername, String date) {
        this.id = id;
        this.totalCost = totalCost;
        this.sellerUsername = sellerUsername;
        this.date = date;
    }

    public float getTotalCost() {
        return totalCost;
    }
    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }
    public String getSellerUsername() {
        return sellerUsername;
    }
    public void setSellerUsername(String sellerUsername) {
        this.sellerUsername = sellerUsername;
    }
    public String getDate() {
        return date;
    }
    public int getId() {
        return id;
    }
}
