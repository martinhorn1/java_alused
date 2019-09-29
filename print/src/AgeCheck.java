import java.util.Scanner;
public class AgeCheck {
    public static void main(String[] args) {
        System.out.print("Type the points [0-60]: ");
        Scanner reader = new Scanner(System.in);
        int age = Integer.parseInt(reader.nextLine());

        if (age >= 0 && age <= 120) {
            System.out.println("OK");
        }
        else {
            System.out.println("Impossible");
        }
    }
}
