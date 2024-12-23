package section7_class_object.uml;

class Engine {
    String type;
    Engine(String type) {
        this.type = type;
    }
}

class Car {
    String model;
    Engine engine; // Composition: Car has an Engine, and Engine depends on Car
    Car(String model, String engineType) {
        this.model = model;
        this.engine = new Engine(engineType);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "V6 Engine");
    }
}
