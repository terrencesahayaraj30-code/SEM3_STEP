// Time Complexity: O(n)
interface PaymentMode {
    double processPayment(double amount);
    String getMode();
}

class CashPayment implements PaymentMode {
    public double processPayment(double amount) { return amount; }
    public String getMode() { return "Cash"; }
}

class CardPayment implements PaymentMode {
    public double processPayment(double amount) { return amount * 1.02; }
    public String getMode() { return "Card"; }
}

class UpiPayment implements PaymentMode {
    public double processPayment(double amount) { return amount; }
    public String getMode() { return "UPI"; }
}

public class PaymentProcessing {
    public static void main(String[] args) {
        PaymentMode[] modes = {new CashPayment(), new CardPayment(), new UpiPayment(), new CardPayment()};
        double[] amounts = {1000, 2000, 1500, 3000};
        double totalProcessed = 0;

        for (int i = 0; i < modes.length; i++) {
            double processed = modes[i].processPayment(amounts[i]);
            double fee = processed - amounts[i];
            totalProcessed += processed;
            System.out.printf("%s: amount %.1f, fee %.1f, processed %.1f%n", modes[i].getMode(), amounts[i], fee, processed);
        }
        System.out.printf("Total Amount Processed: %.1f%n", totalProcessed);
    }
}
