public class SlackNotifierDecorator extends NotifierDecorator{
    SlackNotifierDecorator(Notifier not)
    {
        super(not);
    }
    public void send(String msg)
    {
        super.send(msg);
        System.out.println("Sending Slack..."+msg);
    }
}
