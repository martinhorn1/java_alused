import java.util.Scanner;

public class SumOfSet {
    public static void main(String[] args) {
        int start = 1;
        System.out.print("Until what? ");
        Scanner read = new Scanner(System.in);
        int stop = Integer.parseInt(read.nextLine());
        int count = 0;
        while (start <= stop) {
            count += start;
            start++;
        }
        System.out.println("Sum is " + count);
    }
}
