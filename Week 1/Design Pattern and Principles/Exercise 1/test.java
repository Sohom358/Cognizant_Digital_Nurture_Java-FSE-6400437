public class test {
    public static void main(String args[])
    {
        Logger obj1=Logger.check();
        Logger obj2=Logger.check();

        if(obj1==obj2)
            System.out.println("Only 1 instance is created");
    }
    
}
