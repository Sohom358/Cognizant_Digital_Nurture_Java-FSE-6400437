public class Product {
    int productId;
    String productName;
    String category;
    Product(int Id, String Name, String cat)
    {
        productId=Id;
        productName=Name;
        category=cat;
    }

    void display() {
        System.out.println("ID: " + productId + ", Name: " + productName + ", Category: " + category);
    }
}
