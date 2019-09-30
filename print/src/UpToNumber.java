import java.util.Scanner;

public class UpToNumber {
    public static void main(String[] args) {
        int start = 1;
        System.out.print("Up to what number? ");
        Scanner read = new Scanner(System.in);
        int stop = Integer.parseInt(read.nextLine());
        while (start <= stop) {
            System.out.println(start);
            start++;
        }
    }
}
