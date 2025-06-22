import java.util.*;

public class test {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Searching obj=new Searching();

        Product[] products = {
            new Product(105, "Hair dryer", "Electronics"),
            new Product(101, "T-Shirt", "Apparel"),
            new Product(103, "Laptop", "Electronics"),
            new Product(102, "Notebook", "Stationery"),
            new Product(104, "Shoes", "Footwear"),
            new Product(106, "Tablet", "Electronics")
        };

        System.out.println("Search Demo for E-Commerce...\n");

        while (true) {
            System.out.println("\n New Session \n");
            System.out.println("1. Linear Search");
            System.out.println("2. Binary Search");
            System.out.println("3. Display All Products");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter Product ID to search (Linear): ");
                    int lid = sc.nextInt();
                    Product lp = obj.linearSearch(products, lid);
                    if (lp != null)
                        lp.display();
                    else
                        System.out.println("Product not found.");
                    break;

                case 2:
                    obj.sort(products);
                    System.out.print("Enter Product ID to search (Binary): ");
                    int bid = sc.nextInt();
                    Product bp = obj.binarySearch(products, bid);
                    if (bp != null) 
                        bp.display();
                    else
                        System.out.println("Product not found.");
                    break;

                case 3:
                    System.out.println("All Products:");
                    for (Product p : products)
                        p.display();
                    break;

                case 4:
                    System.out.println("Exiting. Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
    
}
