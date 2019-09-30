import java.util.Scanner;
public class SumOfThree {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;

        System.out.print("Insert number 1: ");
        read = Integer.parseInt(reader.nextLine());
        sum += read;

        System.out.print("Insert number 2: ");
        read = Integer.parseInt(reader.nextLine());
        sum += read;

        System.out.print("Insert number 3: ");
        read = Integer.parseInt(reader.nextLine());
        sum += read;

        System.out.println("Sum: " + sum);
    }
}
