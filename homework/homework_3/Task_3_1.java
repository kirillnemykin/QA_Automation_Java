package homework.homework_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_3_1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть число:");

        int number = Integer.parseInt(reader.readLine());

        if (number % 2 == 0) {
            System.out.println("Число є парним.");
        } else {
            System.out.println("Число є непарним.");
        }

        if (number > 0) {
            System.out.println("Число є додатнім.");
            if (number == 1) {
                System.out.println("1 не є ні простим, ні складеним числом.");
            } else if (number == 2) {
                System.out.println("Число є простим.");
            } else {
                boolean isSimple = true;
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        isSimple = false;
                        break;
                    }
                }
                if (isSimple) {
                    System.out.println("Число є простим.");
                } else {
                    System.out.println("Число є складеним.");
                }
            }

        } else if (number < 0) {
            System.out.println("Число є від'ємним.");
            System.out.println("Від'ємні числа не можуть бути простими чи складеними.");
        } else {
            System.out.println("0 не є ні додатнім, ні від'ємним числом.");
            System.out.println("0 не є ні простим, ні складеним числом.");
        }
    }
}
