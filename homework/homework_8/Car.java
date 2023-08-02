package homework.homework_8;

public class Car extends LandVehicle implements CanTransportPassengers {

    private Engine engine;

    public Car(String brand, String model, Engine engine) {
        super(brand, model);
        this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.println("Drive like a car");
    }

    @Override
    public void passengersTransportation() {
        System.out.println("Transport of passengers by a car");
    }

    public Engine getEngine() {
        return engine;
    }

}
