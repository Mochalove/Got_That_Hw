package question9;

public abstract class Food extends Product implements Consumable, Edible{
    public Food(String name, double price) {
        super(name, price);
    }
}
