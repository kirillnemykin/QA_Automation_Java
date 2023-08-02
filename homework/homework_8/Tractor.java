package homework.homework_8;

public class Tractor extends LandVehicle implements CanTransportGoods {

    private Engine engine;

    public Tractor(String brand, String model, Engine engine) {
        super(brand, model);
        this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.println("Drive like a tractor");
    }

    @Override
    public void goodsTransportation() {
        System.out.println("Transport of goods by a tractor");
    }

    public Engine getEngine() {
        return engine;
    }
}
