package homework.homework_8;

public class Bus extends LandVehicle implements CanTransportPassengers {

    private Engine engine;

    public Bus(String brand, String model, Engine engine) {
        super(brand, model);
        this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.println("Drive like a bus");
    }

    @Override
    public void passengersTransportation() {
        System.out.println("Transport of passengers by a bus");
    }

    public Engine getEngine() {
        return engine;
    }

}
