package homework.homework_3;

public class Task_3_3 {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        double cost = Double.parseDouble(args[1]);
        double tax = Double.parseDouble(args[2]);
        int days;

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            days = 23;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 22;
        } else if (month == 2) {
            days = 20;
        } else {
            days = 0;
        }

        double salaryWithTaxes = days * 8 * cost;
        double salaryWithoutTaxes = salaryWithTaxes - (salaryWithTaxes * tax/100);

        if (days == 0) {
            System.out.println("Необхідно ввести коректний номер місяця (від 1 до 12).");
        } else {
            System.out.println("Зарплатня за місяць з податками складає: " + salaryWithTaxes);
            System.out.println("Зарплатня за місяць без податків складає: " + salaryWithoutTaxes);
        }

    }
}
