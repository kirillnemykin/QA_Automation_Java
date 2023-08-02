package homework.homework_8;

public class Speedboat extends WaterVehicle implements CanTransportPassengers {

    private Engine engine;

    public Speedboat(String brand, String model, Engine engine) {
        super(brand, model);
        this.engine = engine;
    }

    @Override
    public void swim() {
        System.out.println("Swim like a speedboat");
    }

    @Override
    public void passengersTransportation() {
        System.out.println("Transport of passengers by a speedboat");
    }

    public Engine getEngine() {
        return engine;
    }
}
