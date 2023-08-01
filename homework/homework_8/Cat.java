package homework.homework_8;

public class Cat extends Pet implements CanRun, CanVoice {

    public Cat(String kind, String name, String color) {
        super(kind, name, color);
    }

    @Override
    public void run() {
        System.out.println("Run like a cat");
    }

    @Override
    public void voice() {
        System.out.println("Meow!");
    }

}
