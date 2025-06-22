import java.util.*;
public class test {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the message you want to send...");
        String msg=sc.nextLine();
        Notifier not;
        
        not=new EmailNotifier();
        not=new SMSNotifierDecorator(not);
        not=new SlackNotifierDecorator(not);

        not.send(msg);

        sc.close();
    }
    
}
