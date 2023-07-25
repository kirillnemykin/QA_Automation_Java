package homework.homework_7;

public class isoscelesTriangle extends Triangle {

    public isoscelesTriangle(double sideA, double sideB) {
        if (sideA < sideB * 2) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideB;
        } else System.out.println("Such a triangle doesn't exist");
    }
    @Override
    public double getPerimeter() {
        double perimeter = sideA + sideB * 2;
        return perimeter;
    }


}