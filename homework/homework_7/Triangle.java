package homework.homework_7;

public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA < sideB+sideC && sideB < sideA+sideC && sideC < sideA+sideB) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else System.out.println("Such a triangle doesn't exist");
    }

    @Override
    public double getPerimeter() {
        double perimeter = sideA + sideB + sideC;
        return perimeter;
    }

    @Override
    public double getSquare() {
        double p = (sideA+sideB+sideC)/2;
        double square = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
        return square;
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
}
