import java.util.HashMap;
import java.util.Map;

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

    public static void main(String[] args) {
        Storehouse store = new Storehouse();
        store.addProduct("milk", 3, 10);
        store.addProduct("coffee", 5, 7);

        System.out.println("prices:");
        System.out.println("milk: " + store.price("milk"));
        System.out.println("coffee: " + store.price("coffee"));
        System.out.println("sugar: " + store.price("sugar"));
    }
}
