public class Purchase {
    public String product;
    public int amount;
    public int unitPrice;

    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return this.amount*this.unitPrice;
    }

    public void increaseAmount() {
        this.amount += 1;
    }

    public String toString() {
        return product + ": " + amount;
    }

    public static void main(String[] args) {
        Purchase purchase = new Purchase("milk", 4, 2);
        System.out.println( "the total price of a purchase containing four milks is " + purchase.price() );
        System.out.println( purchase );
        purchase.increaseAmount();
        System.out.println( purchase );
    }
}
