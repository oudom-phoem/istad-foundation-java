package classAndObject.productClass;

import classAndObject.productClass.model.Product;

import java.time.Instant;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        Product product = new Product(new Random().nextLong(999999), UUID.randomUUID().toString(), "Coca", 1.5, Date.from(Instant.now()),  Date.from(Instant.now()));

        System.out.println(product);
    }
}
