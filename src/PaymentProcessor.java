public class PaymentProcessor {
    public boolean processPayment(String paymentMethod, double amount) {
        if (paymentMethod.equalsIgnoreCase("Kaspi") ||
                paymentMethod.equalsIgnoreCase("Halyk") ||
                paymentMethod.equalsIgnoreCase("Qiwi")) {
            System.out.println("Processing payment of $" + amount + " using " + paymentMethod + ".");
            return true;
        } else {
            System.out.println("Invalid payment method: " + paymentMethod);
            return false;
        }
    }
}
