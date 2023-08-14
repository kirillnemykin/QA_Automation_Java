package homework.homework_11;


import homework.homework_7.IsoscelesTriangle;
import homework.homework_7.RectangularTriangle;
import homework.homework_7.Trapeze;

public class Main {
    public static void main(String[] args) {
        Trapeze trapeze = new Trapeze(10, 5, 7, 6, 30, 130);
        System.out.println(trapeze.getPerimeter());
        System.out.println(trapeze.getSquare());
    }
}
