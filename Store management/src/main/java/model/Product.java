package src.main.java.model;

public class Product {
    private int id;
    private String name, category, price;

    public Product(int id, String name, String category, String price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
    public String getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
