package homework.homework_8;

public class Boat extends WaterVehicle implements CanTransportPassengers {

    public Boat(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void swim() {
        System.out.println("Swim like a boat");
    }

    @Override
    public void passengersTransportation() {
        System.out.println("Transport of passengers by a boat");
    }
}
