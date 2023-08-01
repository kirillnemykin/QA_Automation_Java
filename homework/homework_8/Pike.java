package homework.homework_8;

public class Pike extends Fish{

    public Pike(String kind, double weight, double length) {
        super(kind, weight, length);
    }

    @Override
    public void swim() {
        System.out.println("Swim like a pike");
    }

}
