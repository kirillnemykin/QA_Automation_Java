package homework.homework_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_4_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean isTrue = true;
        int numMonthlyPayments = 0;
        double minMonthlyPayment = 0;

        System.out.println("Enter the total credit amount:");
        double total = Double.parseDouble(reader.readLine());
        System.out.println("Enter the monthly rate:");
        double rate = Double.parseDouble(reader.readLine());

        do {
            System.out.println("What do you want to calculate?");
            System.out.println("1 - Number of monthly payments");
            System.out.println("2 - Minimum monthly payment");
            int answer = Integer.parseInt(reader.readLine());

            switch (answer) {
                case 1:
                    System.out.println("Enter the minimum monthly payment:");
                    minMonthlyPayment = Double.parseDouble(reader.readLine());
                    numMonthlyPayments = calculateNumMonthlyPayments(total, rate, minMonthlyPayment);
                    System.out.println("Number of monthly payments: " + numMonthlyPayments);
                    isTrue = true;
                    break;

                case 2:
                    System.out.println("Enter the number of monthly payments:");
                    numMonthlyPayments = Integer.parseInt(reader.readLine());
                    minMonthlyPayment = calculateMinMonthlyPayment(total, rate, numMonthlyPayments);
                    System.out.print("Minimum monthly payment: " + minMonthlyPayment);
                    isTrue = true;
                    break;

                default:
                    System.out.println("You've entered an invalid answer!");
                    isTrue = false;
            }
        } while (!isTrue);
    }
    public static int calculateNumMonthlyPayments(double total, double rate, double minMonthlyPayment){
        int numMonthlyPayments = 1;
        total = total - minMonthlyPayment;
        while (total > 0) {
            total = (total + total*rate/100) - minMonthlyPayment;
            numMonthlyPayments++;
        }
        return numMonthlyPayments;
    }
    public static double calculateMinMonthlyPayment(double total, double rate, int numMonthlyPayments) {
        rate = rate/100;
        double minMonthlyPayment;
        minMonthlyPayment = total * ((rate * (Math.pow((1+rate), numMonthlyPayments)))/((Math.pow((1+rate), numMonthlyPayments))-1));
        return minMonthlyPayment;
    }
}
