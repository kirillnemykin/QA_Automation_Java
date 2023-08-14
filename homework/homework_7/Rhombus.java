package homework.homework_7;

public class Rhombus extends Parallelogram{


    public Rhombus(double side, double angleA) {
        super(side, side, angleA);
    }

    @Override
    public double getPerimeter() {
        double perimeter = 4 * super.getSideA();
        return perimeter;
    }

    @Override
    public double getSquare() {
        double square = super.getSquare() * super.getSideA() * Math.sin(super.getAngleA());
        return square;
    }
}
