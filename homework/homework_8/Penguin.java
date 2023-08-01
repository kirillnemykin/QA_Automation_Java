package homework.homework_8;

public class Penguin extends FlightlessBird implements CanSwim {

    public Penguin(String kind) {
        super(kind);
    }

    @Override
    public void run() {
        System.out.println("Run like a penguin");
    }

    @Override
    public void swim() {
        System.out.println("Swim like a penguin");
    }

    @Override
    public void voice() {
        System.out.println("Voice like a penguin");
    }
}
