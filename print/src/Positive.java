import java.util.Scanner;
public class Positive {
    public static void main(String[] args) {
        System.out.print("Type a number: ");
        Scanner reader = new Scanner(System.in);
        int number = Integer.parseInt(reader.nextLine());

        if (number > 0) {
            System.out.println("The number is positive");
        }
        else {
            System.out.println("The number is not positive");
        }
    }
}
