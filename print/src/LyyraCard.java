public class LyyraCard {
    private double balance;

    public LyyraCard(double balaceAtStart) {
        this.balance = balaceAtStart;
    }
    public String toString() {
        return "The card has " + balance + " euros.";
    }
    public void payEconomical() {
        if (this.balance >= 2.50) {
            this.balance = balance - 2.50;
        }
    }
    public void payGourmet() {
        if (this.balance >= 4) {
            this.balance = balance - 4;
        }
    }
    public void loadMoney(double amount) {
        if (amount > 0) {
            if (this.balance + amount > 150) {
                this.balance = 150;
            } else {
                this.balance += amount;
            }
        }
    }

    public static void main(String[] args) {
        LyyraCard card = new LyyraCard(50);
        System.out.println(card);

        card.payEconomical();
        System.out.println(card);

        card.payGourmet();
        card.payEconomical();
        System.out.println(card);
        System.out.println("--------------");

        card = new LyyraCard(5);
        System.out.println(card);

        card.payGourmet();
        System.out.println(card);

        card.payGourmet();
        System.out.println(card);
        System.out.println("-------------");

        card = new LyyraCard(10);
        System.out.println(card);

        card.loadMoney(15);
        System.out.println(card);

        card.loadMoney(10);
        System.out.println(card);

        card.loadMoney(200);
        System.out.println(card);
        System.out.println("--------------");

        card = new LyyraCard(5);
        System.out.println("Pekka: " + card);
        card.loadMoney(-15);
        System.out.println("Pekka: " + card);

        System.out.println("--------------");

        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);

        cardPekka.payGourmet();
        cardBrian.payEconomical();

        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);

        cardPekka.loadMoney(20);
        cardBrian.payGourmet();

        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);

        cardPekka.payEconomical();
        cardPekka.payEconomical();

        cardBrian.loadMoney(50);

        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
    }
}
