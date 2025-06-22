import java.util.Scanner;

public class test
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Inventory obj=new Inventory();
        System.out.println("Inventory Management System...\n");
        while (true)
        {
            System.out.println("\n New Session \n");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Display All Products");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    String name=sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    int qt=sc.nextInt();
                    System.out.print("Enter Price: ");
                    int price=sc.nextInt();
                    Product p = new Product(id,name,qt,price);
                    obj.add(p);
                    break;

                case 2:
                    System.out.print("Enter Product ID to update: ");
                    int uid=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Name: ");
                    String uname=sc.nextLine();
                    System.out.print("Enter New Quantity: ");
                    int uqt=sc.nextInt();
                    System.out.print("Enter New Price: ");
                    int uprice=sc.nextInt();
                    obj.update(uid,uname,uqt,uprice);
                    break;

                case 3:
                    System.out.print("Enter Product ID to delete: ");
                    int did=sc.nextInt();
                    obj.delete(did);
                    break;

                case 4:
                    obj.display();
                    break;

                case 5:
                    System.out.println("Exiting system. Goodbye!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}