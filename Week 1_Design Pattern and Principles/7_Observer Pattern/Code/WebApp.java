public class WebApp implements Observer{
    public void update(int price)
    {
        System.out.println("WebApp...");
        System.out.println("Updated Price..."+price);
    }
    
}
