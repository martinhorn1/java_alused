import java.util.Scanner;

public class NumberToNumber {
    public static void main(String[] args) {
        System.out.print("First: ");
        Scanner read = new Scanner(System.in);
        int start = Integer.parseInt(read.nextLine());

        System.out.print("Last: ");
        Scanner read2 = new Scanner(System.in);
        int stop = Integer.parseInt(read2.nextLine());

        while (start <= stop) {
            System.out.println(start);
            start++;
        }
    }
}
