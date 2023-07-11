package homework.homework_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_2_2 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));

        System.out.println("Введіть кількість робочих годин на тиждень:");

        int hours = Integer.parseInt(reader.readLine());

        System.out.println("Введіть вартість години:");

        double cost = Double.parseDouble(reader.readLine());

        System.out.println("Введіть відсоток податку:");

        double tax = Double.parseDouble(reader.readLine());

        double monthSalaryWithTaxes = cost * hours * 4;

        double monthSalaryWithoutTaxes = monthSalaryWithTaxes - (monthSalaryWithTaxes * tax/100);

        double yearSalaryWithTaxes = monthSalaryWithTaxes * 12;

        double yearSalaryWithoutTaxes = monthSalaryWithoutTaxes * 12;

        System.out.println("Зарплатня на місяць без податків: " + monthSalaryWithoutTaxes);
        System.out.println("Зарплатня на місяць з податками: " + monthSalaryWithTaxes);
        System.out.println("Зарплатня на рік без податків: " + yearSalaryWithoutTaxes);
        System.out.println("Зарплатня на рік з податками: " + yearSalaryWithTaxes);


    }
}
