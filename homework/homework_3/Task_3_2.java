package homework.homework_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_3_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double cost = Double.parseDouble(args[0]);

        System.out.println("Enter the quantity of the product you want to purchase:");
        int quantity = Integer.parseInt(reader.readLine());

        double discount = calculateDiscount(quantity);
        double amount = calculateAmount(quantity, cost, discount);

        System.out.println("The total amount of the product is: " + amount);
    }
    public static double calculateDiscount(int quantity) {
        double discount = 0;
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
        return discount;
    }
    public static double calculateAmount(int quantity, double cost, double discount) {
        return quantity * cost * ((100 - discount) / 100);
    }
}
