package question9;

public class CheeseBurger extends Food{
    public CheeseBurger(String name, double price) {
        super(name, price);
    }

    @Override
    public int consume() {
        int random = (int)(Math.random() * 8);
        return random;
    }
    @Override
    public boolean isEdible() {
        return false;
    }
}
