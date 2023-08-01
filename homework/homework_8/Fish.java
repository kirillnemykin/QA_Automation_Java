package homework.homework_8;

public abstract class Fish extends Animal implements CanSwim {

    private double weight;
    private double length;

    public Fish(String kind, double weight, double length) {
        super(kind);
        this.weight = weight;
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
