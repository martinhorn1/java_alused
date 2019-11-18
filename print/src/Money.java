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

    public static void main(String[] args) {
        Money a = new Money(10,0);
        Money b = new Money(3,0);
        Money c = new Money(5,0);

        System.out.println(a.less(b));  // false
        System.out.println(b.less(c));  // true

    }
}