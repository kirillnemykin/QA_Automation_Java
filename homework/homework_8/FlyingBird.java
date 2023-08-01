package homework.homework_8;

public abstract class FlyingBird extends Bird implements CanFly, CanRun, CanVoice {

    public FlyingBird(String kind) {
        super(kind);
    }

}
