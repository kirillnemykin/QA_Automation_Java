package homework.homework_7;

public class Circle extends Figure{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        perimeter = Math.ceil(perimeter * 100.0) / 100.0;
        return perimeter;
    }

    @Override
    public double getSquare() {
        double square = Math.PI * radius * radius;
        square = Math.ceil(square * 100.0) / 100.0;
        return square;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
