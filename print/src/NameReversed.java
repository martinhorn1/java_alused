import java.util.Scanner;
public class NameReversed {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int letter = name.length()-1;
        System.out.print("In reverse order: ");
        while (true) {
            if (letter < 0) {
                break;
            }
            System.out.print(name.charAt(letter));
            letter--;
        }
    }
}
