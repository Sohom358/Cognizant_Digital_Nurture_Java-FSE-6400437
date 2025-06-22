public class ProxyImage implements image{
    private String str;
    RealImage obj;
    ProxyImage(String str)
    {
        this.str=str;
    }
    public void display()
    {
        if(obj==null)
            obj=new RealImage(str);
        obj.display();
    }
    
}
