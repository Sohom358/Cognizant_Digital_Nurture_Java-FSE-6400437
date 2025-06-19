import java.util.*;
public class test {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter computer details...");
        String str[]=new String[3];
        System.out.println("What is your processor...");
        str[0]=sc.nextLine();
        System.out.println("What is your Graphics card...");
        str[1]=sc.nextLine();
        System.out.println("What is your hard disk size...");
        str[2]=sc.nextLine();

        Computer obj=new Computer.Builder()
        .setCPU(str[0])
        .setRAM(str[1])
        .setStorage(str[2])
        .Build();

        obj.display();
        sc.close();
    }
    
}
