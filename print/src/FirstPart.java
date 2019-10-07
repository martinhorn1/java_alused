import java.util.Scanner;
public class FirstPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        Scanner reader2 = new Scanner(System.in);
        System.out.print("Length of the first part: ");
        int letters = Integer.parseInt(reader.nextLine());

        System.out.println("Result: " + name.substring(0, letters));
    }
}
