// Vehicle interface
interface Vehicle {
    void create();
}

// Concrete class for Car
class Car implements Vehicle {
    @Override
    public void create() {
        System.out.println("A Car has been created.");
    }
}

// Concrete class for Bike
class Bike implements Vehicle {
    @Override
    public void create() {
        System.out.println("A Bike has been created.");
    }
}

// Abstract factory class with a factory method
abstract class VehicleFactory {
    public abstract Vehicle createVehicle(String type);
}

// Concrete Factory to produce Car or Bike
class ConcreteVehicleFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle(String type) {
        if ("Car".equalsIgnoreCase(type)) {
            return new Car();
        } else if ("Bike".equalsIgnoreCase(type)) {
            return new Bike();
        }
        return null;
    }
}

public class A_2_que_2 {
    public static void main(String[] args) {
        VehicleFactory factory = new ConcreteVehicleFactory();

        Vehicle car = factory.createVehicle("Car");
        car.create();  // Output: A Car has been created.

        Vehicle bike = factory.createVehicle("Bike");
        bike.create();  // Output: A Bike has been created.
    }
}

