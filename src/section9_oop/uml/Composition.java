package section9_oop.uml;

class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println("The " + type + " engine is starting.");
    }
}

class Car {
    private String model;
    private Engine engine;

    public Car(String model, String engineType) {
        this.model = model;
        this.engine = new Engine(engineType); // Composition: Engine is created within Car
    }

    public void drive() {
        System.out.println(model + " is driving.");
        engine.start();
    }
}

public class Composition {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "V6");
        car.drive();
    }
}

