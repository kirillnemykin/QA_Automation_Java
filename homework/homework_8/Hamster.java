package homework.homework_8;

public class Hamster extends Pet implements CanRun, CanVoice {

    public Hamster(String kind, String name, String color) {
        super(kind, name, color);
    }

    @Override
    public void run() {
        System.out.println("Run like a hamster");
    }

    @Override
    public void voice() {
        System.out.println("Voice like a hamster");
    }
}
