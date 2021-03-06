package data;

public class Product {
    private String name;
    private String description;
    private int price;
    private String category;

    public Product(String name, String description, int price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }


    public int getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

}
