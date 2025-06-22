import java.util.*;
public class test {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();  //here we will take the input from server
        ProxyImage pr=new ProxyImage(str);
        pr.display();

        System.out.println("Loading from cache...");
        pr.display();
        sc.close();
    }
}
