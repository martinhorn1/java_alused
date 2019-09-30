import java.util.Scanner;

public class SumOfSet2 {
    public static void main(String[] args) {
        System.out.print("First: ");
        Scanner read1 = new Scanner(System.in);
        int start = Integer.parseInt(read1.nextLine());

        System.out.print("Last: ");
        Scanner read2 = new Scanner(System.in);
        int stop = Integer.parseInt(read2.nextLine());

        int count = 0;
        while (start <= stop) {
            count += start;
            start++;
        }
        System.out.println("The sum is " + count);
    }
}
