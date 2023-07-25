package homework.homework_7;

public class equilateralTriangle extends Triangle{

    public equilateralTriangle(double sideA) {
        this.sideA = sideA;
        this.sideB = sideA;
        this.sideC = sideA;
    }

    @Override
    public double getPerimeter() {
        double perimeter = sideA * 3;
        return perimeter;
    }


}
