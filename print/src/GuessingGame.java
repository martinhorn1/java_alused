import java.util.Scanner;
import java.lang.Math;
public class GuessingGame {
    public static void main(String[] args) {
        int game = drawNumber();
        int counter = 0;
        while (true) {
            System.out.print("Guess the number: ");
            Scanner read = new Scanner(System.in);
            int guess = Integer.parseInt(read.nextLine());

            if (guess == game) {
                counter += 1;
                System.out.println("Congratulations, your guess is correct, it took you " + counter + " tries");
                break;
            }
            else if (guess < game){
                counter += 1;
                System.out.println("The number is greater, guesses made: " + counter);
            }
            else if (guess > game){
                counter += 1;
                System.out.println("The number is lesser, guesses made: " + counter);
            }
        }
    }

    public static int drawNumber() {
        int number = (int)(Math.random()*10);
        return number;
    }
}
