package homework.homework_8;

public class Dove extends FlyingBird {

    public Dove(String kind) {
        super(kind);
    }

    @Override
    public void fly() {
        System.out.println("Fly like a dove");
    }

    @Override
    public void run() {
        System.out.println("Run like a dove");
    }

    @Override
    public void voice() {
        System.out.println("Voice like a dove");
    }
}
