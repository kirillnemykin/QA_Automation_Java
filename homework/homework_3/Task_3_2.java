package homework.homework_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_3_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double cost = Double.parseDouble(args[0]);
        double discount = 0;

        System.out.println("Введіть кількість товару, яку Ви хочете придбати:");
        int quantity = Integer.parseInt(reader.readLine());

        if (quantity > 10 && quantity <= 20) {
            discount = 5;
        } else if (quantity > 20 && quantity <= 30) {
            discount = 10;
        } else if (quantity > 30 && quantity <= 80) {
            if (quantity - 30 <= 10) {
                discount = 12;
            } else {
                discount = 12 + (((quantity - 31) / 10) * 0.4);
            }
        } else if (quantity > 80) {
            discount = 13;
        }

        double amount = quantity * cost * ((100 - discount) / 100);

        System.out.println("Загальна сума товару складає: " + amount);

    }
}
