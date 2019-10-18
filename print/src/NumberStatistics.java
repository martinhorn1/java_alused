import java.util.Scanner;

public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountOfNumbers = amountOfNumbers;
    }
    public void addNumber(int number) {
        this.sum += number;
        this.amountOfNumbers += 1;

    }
    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }

    public int sum() {
        return this.sum;
    }
    public double average() {
        if (this.amountOfNumbers == 0) {
            return 0;
        } else {
            return (double) sum / amountOfNumbers;
        }
    }

    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics oddStats = new NumberStatistics();
        NumberStatistics evenStats = new NumberStatistics();
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers:");
        while (true) {
            int s = Integer.parseInt(reader.nextLine());
            if (s == -1) {
                break;
            }
            if (s % 2 == 0) {
                evenStats.addNumber(s);
            }
            else {
                oddStats.addNumber(s);
            }
            stats.addNumber(s);
        }
        System.out.println("Sum: " + stats.sum());
        System.out.println("Sum of even: " + evenStats.sum());
        System.out.println("Sum of odd: " + oddStats.sum());
    }
}
