
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }

    public int price(String product) {
        if (this.prices.containsKey(product)) {
            return this.prices.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (this.stocks.containsKey(product)) {
            return this.stocks.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (!this.stocks.containsKey(product)) {
            return false;
        }
        if (this.stocks.get(product) > 0) {
            int stock = this.stocks.get(product) - 1;
            this.stocks.put(product, stock);
        }
        if (this.stocks.get(product) > 0) {
            return true;
        } else {
            return false;
        }
        
    }

    public Set<String> products() {
        return this.prices.keySet();
    }
    

}
