import java.util.Scanner;
public class EndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String name = reader.nextLine();
        Scanner reader2 = new Scanner(System.in);
        System.out.print("Length of the last part: ");
        int letters = Integer.parseInt(reader2.nextLine());

        System.out.println("Result: " + name.substring(name.length()-letters, name.length()));
    }
}
