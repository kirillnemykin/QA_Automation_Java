package homework.homework_8;

public class Airplane extends AirVehicle implements CanTransportPassengers, CanDrive{

    private Engine engine;

    public Airplane(String brand, String model, Engine engine) {
        super(brand, model);
        this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.println("Drive like an airplane");
    }

    @Override
    public void fly() {
        System.out.println("Fly like an airplane");
    }

    @Override
    public void passengersTransportation() {
        System.out.println("Transport of passengers by an airplane");
    }

    public Engine getEngine() {
        return engine;
    }
}
