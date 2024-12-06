// Implementing the Engine interface
interface Engine {
    void startEngine();
    void stopEngine();
}

// PetrolEngine class implements Engine
class PetrolEngine implements Engine {
    @Override
    public void startEngine() {
        System.out.println("Starting petrol engine...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping petrol engine...");
    }
}

// ElectricEngine class implements Engine
class ElectricEngine implements Engine {
    @Override
    public void startEngine() {
        System.out.println("Starting electric engine...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping electric engine...");
    }
}

// Vehicle interface
interface Vehicle {
    void drive();
}

// Car class implements Vehicle and uses Engine
class Car implements Vehicle {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void drive() {
        engine.startEngine();
        System.out.println("Car is driving...");
    }
}

// Motorbike class implements Vehicle and uses Engine
class Motorbike implements Vehicle {
    private Engine engine;

    public Motorbike(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void drive() {
        engine.startEngine();
        System.out.println("Motorbike is driving...");
    }
}

public class A_4_que_2{
    public static void main(String[] args) {
        Engine petrolEngine = new PetrolEngine();
        Engine electricEngine = new ElectricEngine();

        Vehicle carWithPetrol = new Car(petrolEngine);
        Vehicle bikeWithElectric = new Motorbike(electricEngine);

        carWithPetrol.drive();
        bikeWithElectric.drive();
    }
}
