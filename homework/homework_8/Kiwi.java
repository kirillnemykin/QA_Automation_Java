package homework.homework_8;

public class Kiwi extends FlightlessBird {

    public Kiwi(String kind) {
        super(kind);
    }

    @Override
    public void run() {
        System.out.println("Run like a kiwi");
    }

    @Override
    public void voice() {
        System.out.println("Voice like a kiwi");
    }
}
