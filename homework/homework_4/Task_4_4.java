package homework.homework_4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task_4_4 {
    public static void main(String[] args) {
        double cost = Double.parseDouble(args[0]);
        double tax = Double.parseDouble(args[1]);
        int[] workingDays = new int[12];
        String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
        double salaryWithTaxes;
        double salaryWithoutTaxes;
        double totalWithTaxes = 0;
        double totalWithoutTaxes = 0;
        int previousWeekDays = 5;
        int nextWeekDays = 0;
        int fullWeekDays;
        int allDays;
        int numWorkingDays;

        for (int i = 0; i < 12; i++) {
            if (i == 0 || i == 2 || i == 4 || i == 6 || i == 7 || i == 9 || i == 11){
                allDays = 31;
            } else if (i == 3 || i == 5 || i == 8 || i == 10) {
                allDays = 30;
            } else {
                allDays = 28;
            }

            fullWeekDays = (allDays-(7-nextWeekDays))/7*5;
            nextWeekDays = (allDays-(7-nextWeekDays))%7;
            if (nextWeekDays == 6) {
                numWorkingDays = previousWeekDays + fullWeekDays + nextWeekDays - 1;
            } else {
                numWorkingDays = previousWeekDays + fullWeekDays + nextWeekDays;
            }
            workingDays[i] = numWorkingDays;
            previousWeekDays = 7 - nextWeekDays - 2;
            if (previousWeekDays < 0) {
                previousWeekDays = 0;
            }
        }

        for (int i = 0; i < workingDays.length; i++) {
            salaryWithTaxes = workingDays[i] * 8 * cost;
            salaryWithoutTaxes = salaryWithTaxes - (salaryWithTaxes * tax/100);
            totalWithTaxes = totalWithTaxes + salaryWithTaxes;
            totalWithoutTaxes = totalWithoutTaxes + salaryWithoutTaxes;
            System.out.println(months[i] + " " + salaryWithoutTaxes + " " + salaryWithTaxes);
        }
        System.out.println("TOTAL: " + totalWithoutTaxes + " " + totalWithTaxes);
}
}
