package homework.homework_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_3_1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number:");
        int number = Integer.parseInt(reader.readLine());

        printNumberInfo(number);
    }
    public static void printNumberInfo(int number) {
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        if (number > 0) {
            System.out.println("The number is positive.");
            if (number == 1) {
                System.out.println("1 is neither a prime nor a composite number.");
            } else if (number == 2) {
                System.out.println("The number is prime.");
            } else {
                boolean isSimple = true;
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        isSimple = false;
                        break;
                    }
                }
                if (isSimple) {
                    System.out.println("The number is prime.");
                } else {
                    System.out.println("The number is composite.");
                }
            }

        } else if (number < 0) {
            System.out.println("The number is negative.");
            System.out.println("Negative numbers cannot be prime or composite.");
        } else {
            System.out.println("0 is neither positive nor negative.");
            System.out.println("0 is neither a prime nor a composite number.");
        }
    }
}
