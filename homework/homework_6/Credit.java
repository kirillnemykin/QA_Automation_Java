package homework.homework_6;

public class Credit {
    private double totalAmount;
    private double rate;
    private int numberOfPayments;
    private double minimalPayment;

    public Credit(double totalAmount, double rate, int numberOfPayments) {
        this.totalAmount = totalAmount;
        this.rate = rate;
        this.numberOfPayments = numberOfPayments;
    }

    public Credit(double totalAmount, double rate, double minimalPayment) {
        this.totalAmount = totalAmount;
        this.rate = rate;
        this.minimalPayment = minimalPayment;
    }

    public static double calculateMinimalPayment(double totalAmount, double rate, int numberOfPayments){
        rate = rate/100;
        double minimalPayment;
        minimalPayment = totalAmount * ((rate * (Math.pow((1+rate), numberOfPayments)))/((Math.pow((1+rate), numberOfPayments))-1));
        return minimalPayment;
    }

    public static int calculateNumberOfPayments(double totalAmount, double rate, double minimalPayment){
        int numberOfPayments = 1;
        totalAmount = totalAmount - minimalPayment;
        while (totalAmount > 0) {
            totalAmount = (totalAmount + totalAmount*rate/100) - minimalPayment;
            numberOfPayments++;
        }
        return numberOfPayments;
}

    public double getTotalAmount() {
        return totalAmount;
    }

    public double getRate() {
        return rate;
    }

    public int getNumberOfPayments() {
        return numberOfPayments;
    }

    public double getMinimalPayment() {
        return minimalPayment;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setNumberOfPayments(int numberOfPayments) {
        this.numberOfPayments = numberOfPayments;
    }

    public void setMinimalPayment(double minimalPayment) {
        this.minimalPayment = minimalPayment;
    }
}
