package homework.homework_8;

public class Barge extends WaterVehicle implements CanTransportGoods {

    private Engine engine;

    public Barge(String brand, String model, Engine engine) {
        super(brand, model);
        this.engine = engine;
    }

    @Override
    public void swim() {
        System.out.println("Swim like a barge");
    }

    @Override
    public void goodsTransportation() {
        System.out.println("Transport of goods by a barge");
    }

    public Engine getEngine() {
        return engine;
    }

}
