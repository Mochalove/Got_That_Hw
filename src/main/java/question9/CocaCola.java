package question9;

public class CocaCola extends Drink{
    public CocaCola(String name, double price){
        super(name, price);
    }
    @Override
    public int consume() {
        int random = (int)(Math.random() * 5);
        return random;
    }
}
