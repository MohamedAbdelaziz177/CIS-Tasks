public class VisaStrategy implements IPaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Visa payment method");
    }
}
