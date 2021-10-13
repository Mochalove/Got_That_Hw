package question9;

public class Batteries extends Product implements Consumable{

    public Batteries(String name, double price) {
        super(name, price);

    }
    @Override
    public int consume() {
        int random = (int)(Math.random() * 101);
        return random;
    }
}
