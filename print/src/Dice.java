import java.util.Random;

public class Dice {
    private Random random;
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        random = new Random();
    }

    public int roll() {
        return this.random.nextInt(this.numberOfSides) + 1;
    }

    public static void main(String[] args) {
        Dice dice = new Dice(6);

        int i = 0;
        while (i < 10) {
            System.out.println(dice.roll());
            i++;
        }
    }
}
