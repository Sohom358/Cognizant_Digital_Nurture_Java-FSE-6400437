public class test {
    public static void main(String args[])
    {
        StockMarket obj=new StockMarket();
        MobileApp mob=new MobileApp();
        WebApp web=new WebApp();
        obj.register(mob);
        obj.register(web);
        obj.PriceChange(100);
        obj.PriceChange(50);
        obj.PriceChange(300);
        obj.deregister(mob);
        obj.PriceChange(400);        

    }
    
}
