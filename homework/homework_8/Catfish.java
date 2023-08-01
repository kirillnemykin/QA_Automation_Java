package homework.homework_8;

public class Catfish extends Fish {

    public Catfish(String kind, double weight, double length) {
        super(kind, weight, length);
    }

    @Override
    public void swim() {
        System.out.println("Swim like a catfish");
    }

}
