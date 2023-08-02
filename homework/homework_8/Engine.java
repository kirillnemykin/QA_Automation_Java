package homework.homework_8;

public abstract class Engine {

    private String type;
    private double power;

    public Engine(String type, double power) {
        this.type = type;
        this.power = power;
    }

    public abstract void engineWork();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}
