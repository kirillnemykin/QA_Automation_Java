package homework.homework_8;

public class Balloon extends AirVehicle implements CanTransportPassengers{

    public Balloon(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void fly() {
        System.out.println("Fly like a balloon");
    }

    @Override
    public void passengersTransportation() {
        System.out.println("Transport of passengers by a balloon");
    }

}
