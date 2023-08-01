package homework.homework_8;

public class Eagle extends FlyingBird {

    public Eagle(String kind) {
        super(kind);
    }

    @Override
    public void fly() {
        System.out.println("Fly like a eagle");
    }

    @Override
    public void run() {
        System.out.println("Run like a eagle");
    }

    @Override
    public void voice() {
        System.out.println("Voice like a eagle");
    }
}
