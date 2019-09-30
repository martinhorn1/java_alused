import java.util.Scanner;

public class SumOfPowers {
    public static void main(String[] args) {
        System.out.print("Type a number: ");
        Scanner read = new Scanner(System.in);
        int number = Integer.parseInt(read.nextLine());

        int res = 0;
        while (number >= 0) {
            res += (int)Math.pow(2,number);
            number--;
        }
        System.out.println("The result is " + res);
    }
}
