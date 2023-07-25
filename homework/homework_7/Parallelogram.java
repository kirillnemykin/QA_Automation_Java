package homework.homework_7;

public class Parallelogram extends Quadrangle{

    public Parallelogram(double sideA, double sideB, double angleA) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideA;
            this.sideD = sideB;
            this.angleA = angleA;
            this.angleB = 180 - angleA;
            this.angleC = angleA;
            this.angleD = 180 - angleA;
    }

    public Parallelogram() {

    }


    @Override
    public double getPerimeter() {
        double perimeter = sideA*2 + sideB*2;
        return perimeter;
    }


}
