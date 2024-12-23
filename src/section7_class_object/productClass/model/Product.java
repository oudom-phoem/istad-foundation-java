package section7_class_object.productClass.model;

import java.util.Date;

public class Product {
    private Long id;
    private String uuid;
    private String productName;
    private Double price;
    private Date releaseDate;
    private Date expiryDate;

    // constructor without parameter
    public Product() {}

    // constructor with parameter
    public Product(Long id, String uuid, String productName, Double price, Date releaseDate, Date expiryDate) {
        this.id = id;
        this.uuid = uuid;
        this.productName = productName;
        this.price = price;
        this.releaseDate = releaseDate;
        this.expiryDate = expiryDate;
    }

    // get product info
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
