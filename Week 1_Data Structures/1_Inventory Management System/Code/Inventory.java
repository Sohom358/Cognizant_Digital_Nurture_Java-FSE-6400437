import java.util.ArrayList;

public class Inventory {
    ArrayList<Product> inventory=new ArrayList<>();
    void add(Product p)
    {
        inventory.add(p);
    }

    void update(int id,String Name,int qt,int price)
    {
        for (Product p:inventory)
        {
            if (p.productId == id)
            {
                p.productName=Name;
                p.quantity=qt;
                p.price=price;
                return;
            }
        }
        System.out.println("Product not found...");
    }

    void delete(int id)
    {
        for (int i = 0;i<inventory.size();i++)
        {
            if(inventory.get(i).productId==id)
            {
                inventory.remove(i);
                System.out.println("Product record deleted...");
                return;
            }
        }
        System.out.println("Product not found...");
    }

    void display()
    {
        for (Product p :inventory)
        {
            System.out.println("ID: "+p.productId+", Name: "+p.productName+",Qty: "+p.quantity+", Price: "+ p.price);
        }
    }
}