package homework.homework_7;

public class Rectangle extends Parallelogram{

    public Rectangle(double sideA, double sideB) {
        super(sideA, sideB, 90);
    }

    @Override
    public double getSquare() {
        double square = super.getSideA() * super.getSideB();
        square = Math.ceil(square * 100.0) / 100.0;
        return square;
    }
}


