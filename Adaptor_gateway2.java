public class Adaptor_gateway2 implements PaymentProcessor{
    public void processPayment()
    {
        Payment_gateway2 g2=new Payment_gateway2();
        g2.payment2();
    }
}
