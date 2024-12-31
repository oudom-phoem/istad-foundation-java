package e_commerce_system.model;

public class Electronics extends Product {
    public int warrantyYears;

    public Electronics(int id, String name, double price, int warrantyYears) {
        super(id, name, price);
        this.warrantyYears = warrantyYears;
    }

    @Override
    public double calculateDiscount() {
        if (warrantyYears > 2) {
            return getPrice() * 0.10;
        }
        return 0;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Warranty Years: " + warrantyYears);
    }
}
