import java.util.Scanner;
public class ReverseText {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String word1 = reader.nextLine();

        System.out.println(reverse(word1));

    }
    public static String reverse(String text) {
        String help = "";
        for (int i = text.length()-1; i >= 0; i--){
            help += text.charAt(i);
        }
        return help;
    }
}
