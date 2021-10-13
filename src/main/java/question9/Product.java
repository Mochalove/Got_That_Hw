package question9;

import java.util.ArrayList;

public class Product {
    private String name;
    private double price;
    protected ExpirationDate expirationDate;
    public final double dtzrate = 0.2;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public void printExpirationDate(Product product){
        System.out.println(product.expirationDate);
    }
    public static void printConsumQty(ArrayList<Consumable> consumables){
        for(Consumable t: consumables){
            System.out.println(t.consume());;
        }
    }

}
