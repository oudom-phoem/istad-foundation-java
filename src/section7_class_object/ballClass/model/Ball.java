package section7_class_object.ballClass.model;

import java.util.Date;

public class Ball {
    private Integer id;
    private String ballType;
    private Date publishedDate;
    private Double price;
    private Double discountAmount;

    public Ball() {};
    public Ball(Integer id, String ballType, Date publishedDate, Double price, Double discountAmount) {
        this.id = id;
        this.ballType = ballType;
        this.publishedDate = publishedDate;
        this.price = price;
        this.discountAmount = discountAmount;
    }

    public Integer getId() {
        return id;
    }

    public String getBallType() {
        return ballType;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public Double getPrice() {
        return price;
    }

    public Double getDiscountAmount() {
        return discountAmount;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "id=" + id +
                ", ballType='" + ballType + '\'' +
                ", publishedDate=" + publishedDate +
                ", price=" + price +
                ", discountAmount=" + discountAmount +
                '}';
    }
}