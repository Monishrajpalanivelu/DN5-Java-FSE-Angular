import java.util.*;

class Product{
    int productId;
    String productName;
    int quantity;
    double price;

    Product(int id,String name,int qty,double price){
        productId=id;
        productName=name;
        quantity=qty;
        this.price=price;
    }
}

public class InventoryManagement{

    ArrayList<Product> products=new ArrayList<>();

    void add(Product p){
        products.add(p);
    }

    void update(int id,int qty){
        for(Product p:products)
            if(p.productId==id)
                p.quantity=qty;
    }

    void delete(int id){
        products.removeIf(p->p.productId==id);
    }

    public static void main(String args[]){
        InventoryManagement s=new InventoryManagement();
        s.add(new Product(1,"Laptop",1,50000));
        System.out.println("Inventory Added");
    }
}