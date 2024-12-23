package section7_class_object.gunClass;

import section7_class_object.gunClass.model.Gun;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        Gun gun1 = new Gun();
        gun1.id = new Random().nextInt(99999);
        gun1.uuid = UUID.randomUUID().toString();
        gun1.model = "AWM";
        gun1.releaseDate = LocalDateTime.of(1945, 3, 18, 15, 42);
        System.out.println(gun1);

    }
}
