package homework.homework_7;

public class Rhombus extends Parallelogram{


    public Rhombus(double side, double angleA) {
        super(side, side, angleA);
    }

    @Override
    public double getPerimeter() {
        double perimeter = 4 * super.getSideA();
        perimeter = Math.ceil(perimeter * 100.0) / 100.0;
        return perimeter;
    }

    @Override
    public double getSquare() {
        double square = super.getSquare() * super.getSideA() * Math.sin(Math.toRadians(super.getAngleA()));
        square = Math.ceil(square * 100.0) / 100.0;
        return square;
    }
}
