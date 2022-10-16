
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (this.cart.containsKey(product)) {
            this.cart.get(product).increaseQuantity();
            this.cart.get(product).price();
            this.cart.put(product, this.cart.get(product));
        } else {
            Item item = new Item(product, 1, price);
            this.cart.put(product, item);
        }
    }

    public int price() {
        int sum = 0;
        for (Item item : this.cart.values()) {
            sum += item.price();
        }
        return sum;
    }

    public void print() {
        for (Item item : this.cart.values()) {
            System.out.println(item.toString());
        }
    }
}
