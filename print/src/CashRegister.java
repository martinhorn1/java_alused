public class CashRegister {
    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold

    public CashRegister() {
        cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        if (cashGiven >= 2.50) {
            economicalSold += 1;
            cashInRegister += 2.50;
            return cashGiven - 2.50;
        }
        else {
            return cashGiven;
        }
        // the price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of the sold lunches is incremented by one
        //    the method returns cashGiven - lunch price
        // if not enough money is given, all is returned and nothing else happens
    }

    public double payGourmet(double cashGiven) {
        if (cashGiven >= 4) {
            gourmetSold += 1;
            cashInRegister += 4;
            return cashGiven - 4;
        }
        else {
            return cashGiven;
        }
        // the price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to the register
        //    the amount of the sold lunches is incremented by one
        //    the method returns cashGiven - lunch price
        // if not enough money is given, all is returned and nothing else happens
    }

    public boolean payEconomical(LyyraCard card) {
        if (card.balance() >= 2.50) {
            card.pay(2.50);
            economicalSold += 1;
            return true;
        }
        else {
            return false;
        }
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
    }

    public boolean payGourmet(LyyraCard card) {
        if (card.balance() >= 4) {
            card.pay(4);
            gourmetSold += 1;
            return true;
        }
        else {
            return false;
        }
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            cashInRegister += sum;
        }
    }

    public String toString() {
        return "money in register "+cashInRegister+"; economical lunches sold: "+economicalSold+"; gourmet lunches sold: "+gourmetSold;
    }

    public static void main(String[] args) {
        CashRegister unicafeExactum = new CashRegister();
        System.out.println( unicafeExactum );

        LyyraCard cardOfJim = new LyyraCard(2);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        unicafeExactum.loadMoneyToCard(cardOfJim, 100);

        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        System.out.println( unicafeExactum );
    }
}