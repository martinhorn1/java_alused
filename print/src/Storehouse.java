import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    public Map<String, Integer> productPrices;
    public Map<String, Integer> productStock;

    public Storehouse() {
        productPrices = new HashMap<>();
        productStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        productPrices.put(product, price);
        productStock.put(product, stock);
    }

    public int price(String product) {
        if (productPrices.containsKey(product)) {
            return productPrices.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (productStock.containsKey(product)) {
            return productStock.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (productStock.containsKey(product) && productStock.get(product) > 0) {
            productStock.put(product, productStock.get(product)-1);
            return true;
        }
        return false;
    }

    public Set<String> products() {
        return productPrices.keySet();
    }

    public static void main(String[] args) {
        Storehouse store = new Storehouse();
        store.addProduct("milk", 3, 10);
        store.addProduct("coffee", 5, 6);
        store.addProduct("buttermilk", 2, 20);
        store.addProduct("jogurt", 2, 20);

        System.out.println("products:");
        for (String product : store.products()) {
            System.out.println(product);
        }
    }
}
