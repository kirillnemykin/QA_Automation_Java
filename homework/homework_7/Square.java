package homework.homework_7;

public class Square extends Rectangle{

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        double perimeter = 4 * super.getSideA();
        return perimeter;
    }

    @Override
    public double getSquare() {
        double square = super.getSideA() * super.getSideA();
        return square;
    }
}
