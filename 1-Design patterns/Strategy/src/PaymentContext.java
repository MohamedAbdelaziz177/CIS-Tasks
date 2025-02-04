public class PaymentContext {

    private IPaymentStrategy paymentStrategy;
    public PaymentContext(IPaymentStrategy paymentStrategy)
    {
        this.paymentStrategy = paymentStrategy;
    }

    public void SetStrategy(IPaymentStrategy paymentStrategy)
    {
        this.paymentStrategy = paymentStrategy;
    }

    public void ExecuteStrategy()
    {
        paymentStrategy.pay();
    }
}
