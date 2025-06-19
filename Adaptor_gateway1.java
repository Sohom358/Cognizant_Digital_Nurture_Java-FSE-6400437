public class Adaptor_gateway1 implements PaymentProcessor{
    public void processPayment()
    {
        Payment_gateway1 g1=new Payment_gateway1();
        g1.payment1();
    }
}
