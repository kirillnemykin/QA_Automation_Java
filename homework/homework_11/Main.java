package homework.homework_11;

import homework.homework_7.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int figure;
        String answer;
        boolean isTrue;
        ArrayList<Figure> figures = new ArrayList<Figure>();

        do {
            System.out.println("Which figure do you want to add?");
            System.out.println("1 - circle");
            System.out.println("2 - triangle");
            System.out.println("3 - rectangular triangle");
            System.out.println("4 - isosceles triangle");
            System.out.println("5 - equilateral triangle");
            System.out.println("6 - parallelogram");
            System.out.println("7 - rectangle");
            System.out.println("8 - square");
            System.out.println("9 - rhombus");
            System.out.println("10 - trapeze");

            figure = Integer.parseInt(reader.readLine());

            switch (figure) {
                case 1:
                    System.out.println("Enter radius:");
                    double radius = Double.parseDouble(reader.readLine());

                    Circle circle = new Circle(radius);
                    figures.add(circle);

                    break;

                case 2:
                    System.out.println("Enter side A:");
                    double sideA = Double.parseDouble(reader.readLine());
                    System.out.println("Enter side B:");
                    double sideB = Double.parseDouble(reader.readLine());
                    System.out.println("Enter side C:");
                    double sideC = Double.parseDouble(reader.readLine());

                    if (sideA < sideB+sideC && sideB < sideA+sideC && sideC < sideA+sideB) {
                        Triangle triangle = new Triangle(sideA, sideB, sideC);
                        figures.add(triangle);
                    } else System.out.println("Such a triangle doesn't exist");

                    break;

                case 3:
                    System.out.println("Enter side A:");
                    sideA = Double.parseDouble(reader.readLine());
                    System.out.println("Enter side B:");
                    sideB = Double.parseDouble(reader.readLine());

                    RectangularTriangle rectangularTriangle = new RectangularTriangle(sideA, sideB);
                    figures.add(rectangularTriangle);

                    break;

                case 4:
                    System.out.println("Enter base:");
                    double base = Double.parseDouble(reader.readLine());
                    System.out.println("Enter side:");
                    double side = Double.parseDouble(reader.readLine());

                    if (base < side*2) {
                        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(base, side);
                        figures.add(isoscelesTriangle);
                    } else System.out.println("Such a triangle doesn't exist");

                    break;

                case 5:
                    System.out.println("Enter side:");
                    side = Double.parseDouble(reader.readLine());

                    EquilateralTriangle equilateralTriangle = new EquilateralTriangle(side);
                    figures.add(equilateralTriangle);

                    break;

                case 6:
                    System.out.println("Enter side A:");
                    sideA = Double.parseDouble(reader.readLine());
                    System.out.println("Enter side B:");
                    sideB = Double.parseDouble(reader.readLine());
                    System.out.println("Enter angle A:");
                    double angleA = Double.parseDouble(reader.readLine());

                    Parallelogram parallelogram = new Parallelogram(sideA, sideB, angleA);
                    figures.add(parallelogram);

                    break;

                case 7:
                    System.out.println("Enter side A:");
                    sideA = Double.parseDouble(reader.readLine());
                    System.out.println("Enter side B:");
                    sideB = Double.parseDouble(reader.readLine());

                    Rectangle rectangle = new Rectangle(sideA, sideB);
                    figures.add(rectangle);

                    break;

                case 8:
                    System.out.println("Enter side:");
                    side = Double.parseDouble(reader.readLine());

                    Square square = new Square(side);
                    figures.add(square);

                    break;

                case 9:
                    System.out.println("Enter side:");
                    side = Double.parseDouble(reader.readLine());
                    System.out.println("Enter angle A:");
                    angleA = Double.parseDouble(reader.readLine());

                    Rhombus rhombus = new Rhombus(side, angleA);
                    figures.add(rhombus);

                    break;

                case 10:
                    System.out.println("Enter side A:");
                    sideA = Double.parseDouble(reader.readLine());
                    System.out.println("Enter side B:");
                    sideB = Double.parseDouble(reader.readLine());
                    System.out.println("Enter side C:");
                    sideC = Double.parseDouble(reader.readLine());
                    System.out.println("Enter side D:");
                    double sideD = Double.parseDouble(reader.readLine());
                    System.out.println("Enter angle A:");
                    angleA = Double.parseDouble(reader.readLine());
                    System.out.println("Enter angle C:");
                    double angleC = Double.parseDouble(reader.readLine());

                    if (sideA < sideB+sideC+sideD && sideB < sideA+sideC+sideD && sideC < sideA+sideB+sideD && sideD < sideA+sideB+sideC) {
                        Trapeze trapeze = new Trapeze(sideA, sideB, sideC, sideD, angleA, angleC);
                        figures.add(trapeze);
                    } else System.out.println("Such a quadrangle doesn't exist.");

                    break;

                default:
                    System.out.println("You've entered an invalid value!");
            }

            do {
                System.out.println("Do you want to add one more shape? (Yes/No)");
                answer = reader.readLine();

                if (answer.equalsIgnoreCase("Yes")) {
                    isTrue = true;
                    break;
                } else if (answer.equalsIgnoreCase("No")) {
                    isTrue = false;
                    break;
                } else {
                    System.out.println("You've entered an invalid answer!");
                }
            } while (true);

        } while (isTrue);

        figureSorting(figures);
        printList(figures);

    }

    public static ArrayList<Figure> figureSorting(ArrayList<Figure> figures){
        Comparator figureComparator = new FigureComparator();
        Collections.sort(figures, figureComparator);
        return figures;
    }

    public static void printList(ArrayList<Figure> figures) {
        System.out.println("============= Figure list: ===============");
        for (int i = 0; i < figures.size(); i++) {
            System.out.println((i+1) + ". "
                    + "[" + figures.get(i).getClass().getSimpleName() + "]: "
                    + "Square = " + figures.get(i).getSquare()
                    + " Perimeter = " + figures.get(i).getPerimeter());
        }
    }
}

