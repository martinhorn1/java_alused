import java.util.Scanner;
public class SeparatingChars {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int letter = 0;
        while (true) {
            if (letter == name.length()) {
                break;
            }
            System.out.println((letter+1) + ". character: " + name.charAt(letter));
            letter++;
        }
    }
}
