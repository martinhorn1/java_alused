import java.util.Scanner;
public class GreaterNumber {
    public static void main(String[] args) {
        System.out.print("Type a number: ");
        Scanner reader = new Scanner(System.in);
        int number = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        Scanner reader2 = new Scanner(System.in);
        int number2 = Integer.parseInt(reader2.nextLine());


        if (number < number2) {
            System.out.println("Greater number: " + number2);
        }
        else if (number > number2) {
            System.out.println("Greater number: " + number);
        }
        else {
            System.out.println("The numbers are equal");
        }
    }
}
