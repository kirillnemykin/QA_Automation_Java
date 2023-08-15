package homework.homework_7;

public class Parallelogram extends Quadrangle{

    public Parallelogram(double sideA, double sideB, double angleA) {
            super(sideA, sideB, sideA, sideB, angleA, 180-angleA, angleA, 180-angleA);
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2*super.getSideA() + 2*super.getSideB();
        perimeter = Math.ceil(perimeter * 100.0) / 100.0;
        return perimeter;
    }

    @Override
    public double getSquare() {
        double square = super.getSideA() * super.getSideB() * Math.sin(Math.toRadians(super.getAngleA()));
        square = Math.ceil(square * 100.0) / 100.0;
        return square;
    }

}
