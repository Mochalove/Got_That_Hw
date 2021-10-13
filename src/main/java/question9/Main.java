package question9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Batteries battery = new Batteries("Energy Bunny", 3.95);
        CocaCola cocaCola = new CocaCola("High-C", 1.87);
        CheeseBurger cheeseBurger = new CheeseBurger("Impossible Burger", 4.67);
       // Consumable[] consumables = {battery, cocaCola, cheeseBurger};
        ArrayList<Consumable>  consumables = new ArrayList<>();
        consumables.add(battery);
        consumables.add(cocaCola);
        consumables.add(cheeseBurger);
        Product.printConsumQty(consumables);
    }
}
