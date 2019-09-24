import java.util.Scanner;
public class Comparing {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Insert a number");
        int a = Integer.parseInt(reader.nextLine());
        System.out.println("Insert another number");
        int b = Integer.parseInt(reader.nextLine());

        System.out.println("The bigger number of the 2 numbers given: " + Math.max(a, b));
    }
}
