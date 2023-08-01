package homework.homework_8;

public class Ostrich extends FlightlessBird {

    public Ostrich(String kind) {
        super(kind);
    }

    @Override
    public void run() {
        System.out.println("Run like a ostrich");
    }

    @Override
    public void voice() {
        System.out.println("Voice like a ostrich");
    }
}
