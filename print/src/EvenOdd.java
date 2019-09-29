import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        System.out.print("Type a number: ");
        Scanner reader = new Scanner(System.in);
        int number = Integer.parseInt(reader.nextLine());

        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even!");
        }
        else {
            System.out.println("Number " + number + " is odd!");
        }
    }
}
