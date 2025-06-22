public class SMSNotifierDecorator extends NotifierDecorator {
    SMSNotifierDecorator(Notifier not)
    {
        super(not);
    }

    public void send(String msg)
    {
        super.send(msg);
        System.out.println("Sending SMS..."+msg);
    }
}
