public class EmailNotifier implements Notifier
{
    public void send(String msg)
    {
        System.out.println("Sending mail..."+msg);
    }
}