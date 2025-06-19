public class test {
    public static void main(String args[])
    {
        PaymentProcessor obj;
        obj=new Adaptor_gateway1();
        obj.processPayment();

        obj=new Adaptor_gateway2();
        obj.processPayment();
    }
}
