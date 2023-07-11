package homework.homework_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_2_2 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));

        System.out.println("Enter the number of working hours per week:");
        int hours = Integer.parseInt(reader.readLine());
        System.out.println("Enter the cost of an hour:");
        double cost = Double.parseDouble(reader.readLine());
        System.out.println("Enter the tax percentage:");
        double tax = Double.parseDouble(reader.readLine());

        System.out.println("Salary per month with taxes: " + calculateMonthSalaryWithTaxes(hours, cost));
        System.out.println("Salary per month without taxes: " + calculateMonthSalaryWithoutTaxes(hours, cost, tax));
        System.out.println("Salary per year with taxes: " + calculateYearSalaryWithTaxes(hours, cost));
        System.out.println("Salary per year without taxes: " + calculateYearSalaryWithoutTaxes(hours, cost, tax));

    }
    public static double calculateMonthSalaryWithTaxes(int hours, double cost){
        return cost * hours * 4;
    }
    public  static double calculateMonthSalaryWithoutTaxes(int hours, double cost, double tax){
        double monthSalaryWithTaxes = calculateMonthSalaryWithTaxes(hours, cost);
        return monthSalaryWithTaxes - (monthSalaryWithTaxes * tax/100);
    }
    public static double calculateYearSalaryWithTaxes(int hours, double cost){
        double monthSalaryWithTaxes = calculateMonthSalaryWithTaxes(hours, cost);
        return monthSalaryWithTaxes*12;
    }
    public static double calculateYearSalaryWithoutTaxes(int hours, double cost, double tax){
        double monthSalaryWithoutTaxes = calculateMonthSalaryWithoutTaxes(hours, cost, tax);
        return monthSalaryWithoutTaxes*12;
    }
}
