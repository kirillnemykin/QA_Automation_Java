package homework.homework_8;

public class Helicopter extends AirVehicle implements CanTransportPassengers {

    private Engine engine;

    public Helicopter(String brand, String model, Engine engine) {
        super(brand, model);
        this.engine = engine;
    }

    @Override
    public void fly() {
        System.out.println("Fly like a helicopter");
    }

    @Override
    public void passengersTransportation() {
        System.out.println("Transport of passengers by a helicopter");
    }

    public Engine getEngine() {
        return engine;
    }

}
