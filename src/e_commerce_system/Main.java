package e_commerce_system;

import e_commerce_system.model.Clothing;
import e_commerce_system.model.Electronics;
import e_commerce_system.model.Product;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[4];

        products[0] = new Electronics(1, "Laptop", 1000, 3);
        products[1] = new Electronics(2, "Smartphone", 700, 1);
        products[2] = new Clothing(3, "T-Shirt", 20, "M");
        products[3] = new Clothing(4, "Nham24 Jacket", 60, "L");

        for (Product product : products) {
            product.displayDetails();
            System.out.printf("Discount: $%.2f\n", product.calculateDiscount());
            System.out.println("=".repeat(20));
        }
    }
}
