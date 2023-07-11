package homework.homework_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_2_3 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));

        System.out.println("Enter the number of working hours per week:");
        int hours = Integer.parseInt(reader.readLine());
        System.out.println("Enter the salary per year with taxes:");
        double salaryWithTaxes = Double.parseDouble(reader.readLine());
        System.out.println("Enter the tax percentage:");
        double tax = Double.parseDouble(reader.readLine());

        double salaryWithoutTaxes = calculateSalaryWithoutTaxes(salaryWithTaxes, tax);
        double costWithoutTaxes = calculateCostWithoutTaxes(salaryWithoutTaxes, hours);

        System.out.println("At " + hours + " working hours per week with the salary per year " + salaryWithTaxes + " and tax "
                + tax + " an hour costs " + costWithoutTaxes);
    }
    public static double calculateSalaryWithoutTaxes(double salaryWithTaxes, double tax){
        return salaryWithTaxes - (salaryWithTaxes * tax/100);
    }
    public static double calculateCostWithoutTaxes(double salaryWithoutTaxes, int hours){
        return salaryWithoutTaxes/12/4/hours;
    }
}
