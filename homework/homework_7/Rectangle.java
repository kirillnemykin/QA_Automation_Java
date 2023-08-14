package homework.homework_7;

public class Rectangle extends Parallelogram{

    public Rectangle(double sideA, double sideB) {
        super(sideA, sideB, 90);
    }

    @Override
    public double getSquare() {
        double square = super.getSideA() * super.getSideB();
        return square;
    }
}


