public class MobileApp implements Observer{
    public void update(int price)
    {
        System.out.println("MobileApp...");
        System.out.println("Updated price..."+price);
    }
    
}
