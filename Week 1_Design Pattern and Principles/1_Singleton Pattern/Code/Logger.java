public class Logger
{
    private static Logger ob;
    private Logger()
    {
        System.out.println("Log created");
    }
    public static Logger check()
    {
        if(ob==null)
            ob=new Logger();
        return ob;
    }
}
