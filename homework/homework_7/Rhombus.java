package homework.homework_7;

public class Rhombus extends Parallelogram{

    public Rhombus(double sideA, double angleA) {
        this.sideA = sideA;
        this.sideB = sideA;
        this.sideC = sideA;
        this.sideD = sideA;
        this.angleA = angleA;
        this.angleB = 180 - angleA;
        this.angleC = angleA;
        this.angleD = 180 - angleA;
    }

    @Override
    public double getPerimeter() {
        double perimeter = sideA*4;
        return perimeter;
    }
}
