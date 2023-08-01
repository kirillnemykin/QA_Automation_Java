package homework.homework_8;

public class Dog extends Pet implements CanRun, CanVoice, CanSwim {

    public Dog(String kind, String name, String color) {
        super(kind, name, color);
    }

    @Override
    public void run() {
        System.out.println("Run like a dog");
    }

    @Override
    public void swim() {
        System.out.println("Swim like a dog");
    }

    @Override
    public void voice() {
        System.out.println("Woof!");
    }
}
