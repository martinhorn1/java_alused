import java.util.Scanner;

public class ManyPrints {
    public static void main(String[] args) {
        printText();
    }
    public static void printText() {
        System.out.print("How many? ");
        Scanner read = new Scanner(System.in);
        int res = Integer.parseInt(read.nextLine());
        while (true) {
            if (res <= 0) {
                break;
            }
            System.out.println("In the beginning there were the swamp, the hoe and Java.");
            res--;
        }
    }
}
