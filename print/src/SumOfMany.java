import java.util.Scanner;
public class SumOfMany {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Insert number: ");
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;
            }
            sum += read;
            System.out.println("Sum now: " + sum);
        }
        System.out.println("Sum in the end: " + sum);
    }
}
