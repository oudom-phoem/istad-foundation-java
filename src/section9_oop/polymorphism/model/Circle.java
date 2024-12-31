package section9_oop.polymorphism.model;

import lombok.Data;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
