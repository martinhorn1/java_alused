public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros(){
        return euros;
    }

    public int cents(){
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        int newEuros = euros + added.euros();
        int newCents = cents + added.cents();

        if (newCents > 99) {
            newEuros ++;
            newCents -= 100;
        }
        return new Money(newEuros, newCents);
    }

    public boolean less(Money compared) {
        if (euros < compared.euros) {
            return true;
        }
        else if (euros == compared.euros) {
            if (cents < compared.cents) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    public Money minus(Money decremented) {
        int newEuros = euros - decremented.euros();
        int newCents = cents - decremented.cents();

        if (newCents < 0) {
            newEuros -=1;
            newCents += 100;
        }
        if (newEuros < 0) {
            newEuros = 0;
            newCents = 0;
        }
        return new Money(newEuros, newCents);
    }

    public static void main(String[] args) {
        Money a = new Money(10,0);
        Money b = new Money(3,50);

        Money c = a.minus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 6.50e

        c = c.minus(a);         // NOTE: new Money-object is created and reference to that is assigned to variable c
        //       the Money object 6.50e that variable c used to hold, is not referenced anymore

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 0.00e
    }
}