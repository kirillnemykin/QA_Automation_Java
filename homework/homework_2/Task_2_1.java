package homework.homework_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_2_1  {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введіть число:");

        int number = Integer.parseInt(reader.readLine());

        System.out.println("Введіть степінь:");

        int power = Integer.parseInt(reader.readLine());

        int result = (int) Math.pow(number, power);

        System.out.println("Результат: " + result);
    }
}
