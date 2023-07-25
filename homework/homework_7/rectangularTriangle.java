package homework.homework_7;

public class rectangularTriangle extends Triangle{

    public rectangularTriangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
    }

    @Override
    public double getPerimeter() {
        double perimeter = sideA + sideB+ sideC;
        return perimeter;
    }


}
