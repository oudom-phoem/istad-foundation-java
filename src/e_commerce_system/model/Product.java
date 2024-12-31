package e_commerce_system.model;

@lombok.Getter

public class Product {
    private final int id;
    private final String name;
    private final double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double calculateDiscount() {
        return 0;
    }

    public void displayDetails() {
        System.out.printf("""
                ID: %d
                Name: %s
                Price: $%.2f
                """, id, name, price);
    }
}
