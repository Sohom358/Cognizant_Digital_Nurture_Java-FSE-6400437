public class RealImage implements image{
    private String str;
    RealImage(String str)
    {
        this.str=str;
        load();
    }
    void load()
    {
        System.out.println("Loading "+str+" from server");
    }
    public void display()
    {
        System.out.println(str+" loaded...");
        
    }

}
