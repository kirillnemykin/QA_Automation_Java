package homework.homework_6;

public class Employee {
    private String lastName;
    private String firstName;
    private String position;
    private double salaryPerHour;

    public Employee(String lastName, String firstName, String position, double salaryPerHour) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
        this.salaryPerHour = salaryPerHour;
    }

    public static double calculateMonthlySalary(double salaryPerHour, int workingHours, int workingDays) {
        double monthlySalary = salaryPerHour * workingHours * workingDays;
        return monthlySalary;
    }

    public static void work() {
        System.out.println("I'm working.");
    }

    public static void vacation() {
        System.out.println("I'm on a vacation.");
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPosition() {
        return position;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }
}
