public abstract class NotifierDecorator implements Notifier{

    protected Notifier not;
    NotifierDecorator(Notifier not)
    {
        this.not=not;
    }

    public void send(String msg)
    {
        not.send(msg);
    }
}
