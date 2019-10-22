import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        this.numbers = new ArrayList<>();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers () {
        return this.numbers;
    }

    public void drawNumbers() {
        Random draw = new Random();
        int drawed = draw.nextInt(49)+1;
        while (true) {
            if (numbers.size() == 7) {
                break;
            }
            if (!containsNumber(drawed)) {
                numbers.add(drawed);
            }
            drawed = draw.nextInt(49)+1;
        }
    }

    public boolean containsNumber(int number) {
        if (numbers.contains(number)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        LotteryNumbers lotteryNumbers = new LotteryNumbers();
        ArrayList<Integer> numbers = lotteryNumbers.numbers();

        System.out.println("Lottery numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }
}
