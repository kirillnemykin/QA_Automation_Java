package homework.homework_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_2_3 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));

        System.out.println("Введіть кількість робочих годин на тиждень:");

        int hours = Integer.parseInt(reader.readLine());

        System.out.println("Введіть розмір річної зарплатні з податками:");

        double salaryWithTaxes = Double.parseDouble(reader.readLine());

        System.out.println("Введіть відсоток податку:");

        double tax = Double.parseDouble(reader.readLine());

        double salaryWithoutTaxes = salaryWithTaxes - (salaryWithTaxes * tax/100);

        double costWithoutTaxes = salaryWithoutTaxes/12/4/hours;

        System.out.println("При " + hours + " робочих годин на тиждень з річною зарплатею в " + salaryWithTaxes + " та податком "
                + tax + " година часу коштує " + costWithoutTaxes);
    }
}
