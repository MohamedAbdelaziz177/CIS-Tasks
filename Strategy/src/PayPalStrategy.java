public class PayPalStrategy implements IPaymentStrategy {
    @Override
    public void pay() {
        System.out.println("PayPal payment method");
    }
}
