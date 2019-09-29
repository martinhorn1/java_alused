import java.util.Scanner;
public class GradesPoints {
    public static void main(String[] args) {
        System.out.print("Type the points [0-60]: ");
        Scanner reader = new Scanner(System.in);
        int number = Integer.parseInt(reader.nextLine());

        if (number >= 50) {
            System.out.println("Grade: 5");
        }
        else if (number >= 45) {
            System.out.println("Grade: 4");
        }
        else if (number >= 40) {
            System.out.println("Grade: 3");
        }
        else if (number >= 35) {
            System.out.println("Grade: 2");
        }
        else if (number >= 30) {
            System.out.println("Grade: 1");
        }
        else {
            System.out.println("Grade: failed");
        }
    }
}
