package homework.homework_7;

public class Trapeze extends Quadrangle{

    public Trapeze(double sideA, double sideB, double sideC, double sideD, double angleA, double angleC) {
        if (sideA < sideB+sideC+sideD && sideB < sideA+sideC+sideD && sideC < sideA+sideB+sideD && sideD < sideA+sideB+sideC) {
           this.sideA = sideA;
           this.sideB = sideB;
           this.sideC = sideC;
           this.sideD = sideD;
           this.angleA = angleA;
           this.angleB = 180 - angleA;
           this.angleC = angleC;
           this.angleD = 180 - angleC;
        } else System.out.println("Such a quadrangle doesn't exist.");
    }

    @Override
    public double getPerimeter() {
        double perimeter = sideA + sideB + sideC + sideD;
        return perimeter;
    }
}
