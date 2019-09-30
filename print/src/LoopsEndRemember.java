import java.util.Scanner;

public class LoopsEndRemember {
    public static void main(String[] args) {
        System.out.print("Type numbers: ");

        int number;
        int sum = 0;
        int avg = 0;
        int count = 0;
        int odds = 0;
        int evens = 0;

        while (true) {
            Scanner read = new Scanner(System.in);
            number = Integer.parseInt(read.nextLine());
            if (number == -1) {
                System.out.println("Thank you and see you later");
                break;
            }
            if (number % 2 == 0) {
                evens += 1;
            }
            else {
                odds += 1;
            }
            sum += number;
            count += 1;
        }
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers? " + count);
        System.out.println("The average is " + (double)(sum)/count);
        System.out.println("Even numbers: " + evens);
        System.out.println("Odd numbers: " + odds);
    }
}
