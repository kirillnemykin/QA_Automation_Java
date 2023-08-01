package homework.homework_8;

public class Carp extends Fish {

    public Carp(String kind, double weight, double length) {
        super(kind, weight, length);
    }

    @Override
    public void swim() {
        System.out.println("Swim like a carp");
    }
}
