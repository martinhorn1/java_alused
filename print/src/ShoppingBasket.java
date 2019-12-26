import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    public Map<String, Purchase> purchases;

    public ShoppingBasket() {
        purchases = new HashMap<>();
    }

    public void add(String product, int price) {
        if (purchases.containsKey(product)) {
            purchases.get(product).increaseAmount();
        }
        else {
            purchases.put(product, new Purchase(product, 1, price));
        }
    }

    public int price() {
        int total = 0;
        for (Purchase s : purchases.values()) {
            total += s.price();
        }
        return total;
    }

    public void print() {
        for (Purchase s : purchases.values()) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        ShoppingBasket basket = new ShoppingBasket();
        basket.add("milk", 3);
        basket.add("buttermilk", 2);
        basket.add("cheese", 5);
        System.out.println("basket price: " + basket.price());
        basket.add("computer", 899);
        System.out.println("basket price: " + basket.price());
        System.out.println("-----------");
        System.out.println("Products:");
        basket.print();
    }
}
