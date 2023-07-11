package homework.homework_3;

public class Task_3_3 {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        double cost = Double.parseDouble(args[1]);
        double tax = Double.parseDouble(args[2]);

        int days = calculateDays(month);
        double salaryWithTaxes = calculateSalaryWithTaxes(days, cost);
        double salaryWithoutTaxes = calculateSalaryWithoutTaxes(salaryWithTaxes, tax);

        if (days == 0) {
            System.out.println("You must enter a valid month number (1 to 12).");
        } else {
            System.out.println("Monthly salary with taxes is: " + salaryWithTaxes);
            System.out.println("Monthly salary without taxes is: " + salaryWithoutTaxes);
        }

    }
    public static int calculateDays(int month) {
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
        return days;
    }
    public static double calculateSalaryWithTaxes(int days, double cost) {
        return days * 8 * cost;
    }
    public static double calculateSalaryWithoutTaxes(double salaryWithTaxes, double tax){
        return salaryWithTaxes - (salaryWithTaxes * tax/100);
    }
}
