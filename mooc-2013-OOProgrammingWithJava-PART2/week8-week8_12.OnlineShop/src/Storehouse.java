import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    private Map<String, Integer> storehousePrices = new HashMap<String, Integer>();
    private Map<String, Integer> storehouseStock = new HashMap<String, Integer>();

    public Storehouse() {

    }

    public void addProduct(String product, int price, int stock) {
        this.storehousePrices.put(product, price);
        this.storehouseStock.put(product, stock);
    }

    public int price(String product) {
        if (storehousePrices.containsKey(product)) {
            return storehousePrices.get(product);
        } else {
            return -99;
        }
    }

    public int stock(String product) {
        if (storehouseStock.containsKey(product)) {
            return storehouseStock.get(product);
        } else {
            return 0;
        }
    }

    public boolean take(String product) {
        //only search when map contains key
        if (storehouseStock.containsKey(product)) {
            //cannot take if value is smaller than 0;
            if (storehouseStock.get(product) > 0) {
                storehouseStock.put(product, storehouseStock.get(product) - 1);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public Set<String> products() {
        return this.storehouseStock.keySet();
    }


}
