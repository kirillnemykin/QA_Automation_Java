package homework.homework_7;

public abstract class Quadrangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;
    private double angleA;
    private double angleB;
    private double angleC;
    private double angleD;

    public Quadrangle(double sideA, double sideB, double sideC, double sideD, double angleA, double angleB, double angleC, double angleD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.angleA = angleA;
        this.angleB = angleB;
        this.angleC = angleC;
        this.angleD = angleD;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public double getSideD() {
        return sideD;
    }

    public double getAngleA() {
        return angleA;
    }

    public double getAngleB() {
        return angleB;
    }

    public double getAngleC() {
        return angleC;
    }

    public double getAngleD() {
        return angleD;
    }
}