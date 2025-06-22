import java.util.*;
public class StockMarket implements Stock{
    private List<Observer> observers=new ArrayList<>();
    private int price;
    public void register(Observer ob)
    {
        observers.add(ob);
    }
    public void deregister(Observer ob)
    {
        observers.remove(ob);
    }
    public void PriceChange(int price)
    {
        this.price=price;
        Notify();
    }
    public void Notify()
    {
        for(Observer ob:observers)
            ob.update(price);
    }
    
}
