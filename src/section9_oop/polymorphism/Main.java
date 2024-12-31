package section9_oop.polymorphism;

import section9_oop.polymorphism.model.Circle;
import section9_oop.polymorphism.model.Shape;
import section9_oop.polymorphism.model.Triangle;
import section9_oop.polymorphism.model.User;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        circle.draw();
        triangle.draw();
        //
        User user = new User(1, "Sokpheng", "sokpheng@gmail.com", "12345", "profile.png", "Java Developer", false);
        //user.setId(1);
        //user.setName("Sokpheng");
        System.out.println(user);
        System.out.println(user.getName());

    }
}
