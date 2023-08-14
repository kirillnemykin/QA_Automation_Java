package homework.homework_7;

public class RectangularTriangle extends Triangle{

    public RectangularTriangle(double sideA, double sideB) {
        super(sideA, sideB, Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2)));
    }

}
