package homework.homework_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task_4_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int figure;
        String answer;
        boolean isTrue;

        do {
            System.out.println("Which figure should I print?");
            System.out.println("1 - rectangle");
            System.out.println("2 - right triangle");
            System.out.println("3 - inverse right triangle");
            System.out.println("4 - triangle");

            figure = Integer.parseInt(reader.readLine());

            switch (figure) {
                case 1:
                    System.out.println("Enter height:");
                    int height = Integer.parseInt(reader.readLine());
                    System.out.println("Enter width:");
                    int width = Integer.parseInt(reader.readLine());

                    printRectangle(height, width);
                    break;

                case 2:
                    System.out.println("Enter height:");
                    height = Integer.parseInt(reader.readLine());

                    printRightTriangle(height);
                    break;

                case 3:
                    System.out.println("Enter height:");
                    height = Integer.parseInt(reader.readLine());

                    printInverseRightTriangle(height);
                    break;

                case 4:
                    System.out.println("Enter height:");
                    height = Integer.parseInt(reader.readLine());

                    printTriangle(height);
                    break;

                default:
                    System.out.println("You've entered an invalid value!");
            }
            do {
                System.out.println("Do you want to print one more shape? (Yes/No)");
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
    }

    public static void printRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width - 1; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
    public static void printRightTriangle(int height) {
        String line = "*";
        for (int i = 0; i < height; i++) {
            System.out.println(line);
            line = line + "*";
        }
    }
    public static void printInverseRightTriangle(int height) {
        char[] chars = new char[height];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = ' ';
        }
        for (int i = chars.length - 1; i >= 0; i--) {
            chars[i] = '*';
            for (int j = 0; j < chars.length - 1; j++) {
                System.out.print(chars[j]);
            }
            System.out.println(chars[chars.length - 1]);
        }
    }
    public static void printTriangle(int height) {
        char[] triangle = new char[height * 2 - 1];
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = ' ';
        }
        for (int i = 0; i < height; i++) {
            triangle[height - 1 - i] = '*';
            triangle[height - 1 + i] = '*';
            for (int j = 0; j < triangle.length - 1; j++) {
                System.out.print(triangle[j]);
            }
            System.out.println(triangle[triangle.length - 1]);
        }
    }
}

