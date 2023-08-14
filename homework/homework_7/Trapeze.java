package homework.homework_7;

public class Trapeze extends Quadrangle{

    public Trapeze(double sideA, double sideB, double sideC, double sideD, double angleA, double angleC) {
        super(sideA, sideB, sideC, sideD, angleA, 180 - angleA, angleC, 180 - angleC);
        if (sideA >= sideB + sideC + sideD && sideB >= sideA + sideC + sideD && sideC >= sideA + sideB + sideD && sideD >= sideA + sideB + sideC) {
            System.out.println("Such a quadrangle doesn't exist.");
        }
    }

    @Override
    public double getPerimeter() {
        double perimeter = super.getSideA() + super.getSideB() + super.getSideC() + getSideD();
        return perimeter;
    }

    @Override
    public double getSquare() {
        double a = super.getSideA();
        double b = super.getSideC();
        double c = super.getSideB();
        double d = super.getSideD();
        double p = (a+b+c+d)/2;
        double square = (a+b)/(a-b) * Math.sqrt((p-a)*(p-b)*(p-a-c)*(p-a-d));
                //(a+b)/2 * (Math.sqrt(Math.pow(c,2)-Math.pow(((Math.pow((a-b),2)+Math.pow(c,2)-Math.pow(d,2))/2*(a-b)),2)));
        return square;
    }
}