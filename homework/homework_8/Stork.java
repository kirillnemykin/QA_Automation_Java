package homework.homework_8;

public class Stork extends FlyingBird {

    public Stork(String kind) {
        super(kind);
    }

    @Override
    public void fly() {
        System.out.println("Fly like a stork");
    }

    @Override
    public void run() {
        System.out.println("Run like a stork");
    }

    @Override
    public void voice() {
        System.out.println("Voice like a stork");
    }
}
