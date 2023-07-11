package homework.homework_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_2_1  {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number:");
        int number = Integer.parseInt(reader.readLine());
        System.out.println("Enter the power of the number:");
        int power = Integer.parseInt(reader.readLine());

        System.out.println("Result: " + powNum(number, power));
    }
    public static int powNum(int number, int power) {
        return (int) Math.pow(number, power);
    }
}
